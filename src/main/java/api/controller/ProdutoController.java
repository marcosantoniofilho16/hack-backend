package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Produto;
import api.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController extends CRUDController<ProdutoService, Produto, UUID> {

}
