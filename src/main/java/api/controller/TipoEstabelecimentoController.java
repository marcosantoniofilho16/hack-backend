package api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.TipoEstabelecimento;
import api.service.TipoEstabelecimentoService;

@RestController
@RequestMapping("/tiposEstabelecimento")
public class TipoEstabelecimentoController extends CRUDController<TipoEstabelecimentoService, TipoEstabelecimento, UUID> {

}
