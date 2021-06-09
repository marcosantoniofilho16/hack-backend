package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Desconto;
import api.service.DescontoService;

@RestController
@RequestMapping("/descontos")
public class DescontoController extends CRUDController<DescontoService, Desconto, UUID> {

}
