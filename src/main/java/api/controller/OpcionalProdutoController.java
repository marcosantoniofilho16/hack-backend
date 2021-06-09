package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.OpcionalProduto;
import api.service.OpcionalProdutoService;

@RestController
@RequestMapping("/opcionalProdutos")
public class OpcionalProdutoController extends CRUDController<OpcionalProdutoService, OpcionalProduto, UUID> {

}
