package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.TipoEstabelecimento;
import api.repository.TipoEstabelecimentoRepository;

@Service
public class TipoEstabelecimentoService extends AbstractService<TipoEstabelecimentoRepository, TipoEstabelecimento, UUID> {

}
