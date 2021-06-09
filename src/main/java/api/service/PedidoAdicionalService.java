package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.PedidoAdicional;
import api.repository.PedidoAdicionalRepository;

@Service
public class PedidoAdicionalService extends AbstractService<PedidoAdicionalRepository, PedidoAdicional, UUID>  {

}
