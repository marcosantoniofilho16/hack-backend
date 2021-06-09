package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.OrigemPedido;
import api.repository.OrigemPedidoRepository;

@Service
public class OrigemPedidoService extends AbstractService<OrigemPedidoRepository, OrigemPedido, UUID> {

}
