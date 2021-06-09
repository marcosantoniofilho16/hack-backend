package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Categoria;
import api.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends CRUDController<CategoriaService, Categoria, UUID> {


}
