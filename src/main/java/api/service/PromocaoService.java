package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.Promocao;
import api.repository.PromocaoRepository;

@Service
public class PromocaoService extends AbstractService<PromocaoRepository, Promocao, UUID> {

}
