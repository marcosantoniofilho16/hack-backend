package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Pedido;
import api.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends CRUDController<PedidoService, Pedido, UUID> {

}
