package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.Desconto;
import api.repository.DescontoRepository;

@Service
public class DescontoService extends AbstractService<DescontoRepository, Desconto, UUID> {

}
