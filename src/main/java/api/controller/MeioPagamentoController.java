package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.MeioPagamento;
import api.service.MeioPagamentoService;

@RestController
@RequestMapping("/meiosPagamento")
public class MeioPagamentoController extends CRUDController<MeioPagamentoService, MeioPagamento, UUID> {

}
