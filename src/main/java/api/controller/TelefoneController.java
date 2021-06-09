package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Telefone;
import api.service.TelefoneService;

@RestController
@RequestMapping("/telefones")
public class TelefoneController extends CRUDController<TelefoneService, Telefone, UUID> {

}
