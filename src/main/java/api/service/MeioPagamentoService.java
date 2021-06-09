package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.MeioPagamento;
import api.repository.MeioPagamentoRepository;

@Service
public class MeioPagamentoService extends AbstractService<MeioPagamentoRepository, MeioPagamento, UUID> {

}
