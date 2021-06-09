package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.PedidoAdicional;
import api.service.PedidoAdicionalService;

@RestController
@RequestMapping("/pedidoAdicionais")
public class PedidoAdicionalController extends CRUDController<PedidoAdicionalService, PedidoAdicional, UUID> {

}
