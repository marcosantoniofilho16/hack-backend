package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Estado;
import api.service.EstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController extends CRUDController<EstadoService, Estado, UUID> {

}
