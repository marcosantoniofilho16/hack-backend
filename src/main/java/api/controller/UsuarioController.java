package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Usuario;
import api.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends CRUDController<UsuarioService, Usuario, UUID> {

}
