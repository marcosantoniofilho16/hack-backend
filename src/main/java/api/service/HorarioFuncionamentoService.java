package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.HorarioFuncionamento;
import api.repository.HorarioFuncionamentoRepository;

@Service
public class HorarioFuncionamentoService extends AbstractService<HorarioFuncionamentoRepository, HorarioFuncionamento, UUID> {

}
