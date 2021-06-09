package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.CategoriaProduto;
import api.service.CategoriaProdutoService;

@RestController
@RequestMapping("/categoriaProdutos")
public class CategoriaProdutoController extends CRUDController<CategoriaProdutoService, CategoriaProduto, UUID> {

}
