package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.Pedido;
import api.repository.PedidoRepository;

@Service
public class PedidoService extends AbstractService<PedidoRepository, Pedido, UUID> {

}
