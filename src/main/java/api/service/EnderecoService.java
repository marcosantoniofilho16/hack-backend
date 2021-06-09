package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.Endereco;
import api.repository.EnderecoRepository;

@Service
public class EnderecoService extends AbstractService<EnderecoRepository, Endereco, UUID> {

}
