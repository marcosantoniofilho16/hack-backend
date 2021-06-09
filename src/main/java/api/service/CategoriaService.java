package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.Categoria;
import api.repository.CategoriaRepository;

@Service
public class CategoriaService extends AbstractService<CategoriaRepository, Categoria, UUID> {

}
