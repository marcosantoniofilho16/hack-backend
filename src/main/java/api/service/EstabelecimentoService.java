package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.Estabelecimento;
import api.repository.EstabelecimentoRepository;

@Service
public class EstabelecimentoService extends AbstractService<EstabelecimentoRepository, Estabelecimento, UUID> {

}
