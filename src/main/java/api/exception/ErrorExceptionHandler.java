package api.exception;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.data.repository.support.QueryMethodParameterConversionException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ErrorExceptionHandler extends ResponseEntityExceptionHandler {
	
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		String mensagemUsuario = "A entidade não possui um formato válido!";
		String mensagemDesenvolvedor = ex.getMessage();
		List<Erro> erros = Arrays.asList(new Erro(mensagemUsuario, mensagemDesenvolvedor));
		return handleExceptionInternal(ex, erros, headers, HttpStatus.BAD_REQUEST, request);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		List<Erro> erros = criarListaDeErros(ex.getBindingResult());
		return handleExceptionInternal(ex, erros, headers, HttpStatus.BAD_REQUEST, request);
	}
	
	@ExceptionHandler(AccessDeniedException.class)
	protected ResponseEntity<Object> handleConstraintViolationException(AccessDeniedException ex) {
		String mensagemUsuario = ex.getMessage();
		String mensagemDesenvolvedor = ex.getClass().getName() + ": " + ex.getMessage();
		List<Erro> erros = Arrays.asList(new Erro(mensagemUsuario, mensagemDesenvolvedor));
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erros);
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	protected ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException ex) {
		List<Erro> erros = criarListaDeErros(ex);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erros);
	}
	
	
	@ExceptionHandler(QueryMethodParameterConversionException.class)
	protected ResponseEntity<Object> handleQueryMethodParameterConversion(QueryMethodParameterConversionException ex, HttpServletRequest request){
		
		String mensagemUsuario = "Parametro incompátivel ao tipo esperado pela requisição";
		String mensagemDesenvolvedor = "Não foi possível converter o valor " + ex.getSource() + " para o tipo esperado pelo o campo " + ex.getParameter().getParameterName() + ". "
				+ "Tipo esperado: " + ex.getParameter().getParameterType().getName();
		List<Erro> erros = Arrays.asList(new Erro(mensagemUsuario, mensagemDesenvolvedor));
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erros);	
	}

	
	@ExceptionHandler(IllegalArgumentException.class)
	protected ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException ex, Locale locale) {
		String mensagemUsuario = ex.getMessage();
		String mensagemDesenvolvedor = ex.getClass().getName() + ": " + ex.getMessage();
		List<Erro> erros = Arrays.asList(new Erro(mensagemUsuario, mensagemDesenvolvedor));
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erros);
	}

	@ExceptionHandler(RuntimeException.class)
	protected ResponseEntity<Object> handleRuntimeException(RuntimeException ex, Locale locale) {
		String mensagemUsuario = "A entidade não possui um formato válido!";
		String mensagemDesenvolvedor = ex.getClass().getName() + ": " + ex.getMessage();
		List<Erro> erros = Arrays.asList(new Erro(mensagemUsuario, mensagemDesenvolvedor));
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erros);
	}

	private List<Erro> criarListaDeErros(BindingResult bindingResult) {
		List<Erro> erros = new ArrayList<>();
		for (FieldError fieldError : bindingResult.getFieldErrors()) {
			String mensagemUsuario = String.format("O campo %s é inválido", fieldError.getField());
			String mensagemDesenvolvedor = fieldError.toString();
			erros.add(new Erro(mensagemUsuario, mensagemDesenvolvedor));
		}

		return erros;
	}
	
	private List<Erro> criarListaDeErros(ConstraintViolationException ex) {
		List<Erro> erros = new ArrayList<>();

		Set<ConstraintViolation<?>> constraintViolations = ex.getConstraintViolations();
		if(constraintViolations.size() > 0) {
			Iterator<ConstraintViolation<?>> iterator = constraintViolations.iterator();
	        while(iterator.hasNext()){
	            ConstraintViolation<?> cv = iterator.next();
	            String mensagemUsuario = String.format("O campo %s %s", cv.getPropertyPath(), cv.getMessage());
				String mensagemDesenvolvedor = ex.getMessage();
				erros.add(new Erro(mensagemUsuario, mensagemDesenvolvedor));
	        }
		}

		return erros;
	}

	public static class Erro {

		private String mensagemUsuario;

		private String mensagemDesenvolvedor;

		public Erro(String mensagemUsuario, String mensagemDesenvolvedor) {
			this.mensagemUsuario = mensagemUsuario;
			this.mensagemDesenvolvedor = mensagemDesenvolvedor;
		}

		public String getMensagemUsuario() {
			return mensagemUsuario;
		}

		public void setMensagemUsuario(String mensagemUsuario) {
			this.mensagemUsuario = mensagemUsuario;
		}

		public String getMensagemDesenvolvedor() {
			return mensagemDesenvolvedor;
		}

		public void setMensagemDesenvolvedor(String mensagemDesenvolvedor) {
			this.mensagemDesenvolvedor = mensagemDesenvolvedor;
		}

	}

}

