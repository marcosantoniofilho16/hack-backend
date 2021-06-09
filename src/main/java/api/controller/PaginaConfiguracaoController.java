package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.PaginaConfiguracao;
import api.service.PaginaConfiguracaoService;

@RestController
@RequestMapping("/paginaConfiguracoes")
public class PaginaConfiguracaoController extends CRUDController<PaginaConfiguracaoService, PaginaConfiguracao, UUID> {

}
