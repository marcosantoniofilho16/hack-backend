package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.Cidade;
import api.repository.CidadeRepository;

@Service
public class CidadeService extends AbstractService<CidadeRepository, Cidade, UUID> {

}
