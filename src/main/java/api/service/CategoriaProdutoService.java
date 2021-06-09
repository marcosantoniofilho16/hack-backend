package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.CategoriaProduto;
import api.repository.CategoriaProdutoRepository;

@Service
public class CategoriaProdutoService extends AbstractService<CategoriaProdutoRepository, CategoriaProduto, UUID> {

}
