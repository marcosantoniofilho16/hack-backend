package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.Estado;
import api.repository.EstadoRepository;

@Service
public class EstadoService extends AbstractService<EstadoRepository, Estado, UUID> {

}
