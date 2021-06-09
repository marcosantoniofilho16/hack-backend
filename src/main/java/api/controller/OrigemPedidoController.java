package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.OrigemPedido;
import api.service.OrigemPedidoService;

@RestController
@RequestMapping("/origemPedidos")
public class OrigemPedidoController extends CRUDController<OrigemPedidoService, OrigemPedido, UUID> {

}
