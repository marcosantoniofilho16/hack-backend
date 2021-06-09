package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Endereco;
import api.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController extends CRUDController<EnderecoService, Endereco, UUID> {

}
