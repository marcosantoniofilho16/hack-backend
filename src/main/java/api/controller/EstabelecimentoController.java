package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Estabelecimento;
import api.service.EstabelecimentoService;

@RestController
@RequestMapping("/estabelecimentos")
public class EstabelecimentoController extends CRUDController<EstabelecimentoService, Estabelecimento, UUID> {

}
