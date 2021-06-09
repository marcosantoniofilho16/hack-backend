package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Promocao;
import api.service.PromocaoService;

@RestController
@RequestMapping("/promocoes")
public class PromocaoController extends CRUDController<PromocaoService, Promocao, UUID> {

}
