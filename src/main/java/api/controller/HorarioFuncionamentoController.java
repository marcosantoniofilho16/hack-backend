package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.HorarioFuncionamento;
import api.service.HorarioFuncionamentoService;

@RestController
@RequestMapping("/horariosFuncionamento")
public class HorarioFuncionamentoController extends CRUDController<HorarioFuncionamentoService, HorarioFuncionamento, UUID> {

}
