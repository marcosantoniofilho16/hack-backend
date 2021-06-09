package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.PaginaConfiguracao;
import api.repository.PaginaConfiguracaoRepository;

@Service
public class PaginaConfiguracaoService extends AbstractService<PaginaConfiguracaoRepository, PaginaConfiguracao, UUID> {

}
