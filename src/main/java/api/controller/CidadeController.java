package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Cidade;
import api.service.CidadeService;

@RestController
@RequestMapping("/cidades")
public class CidadeController extends CRUDController<CidadeService, Cidade, UUID> {

}
