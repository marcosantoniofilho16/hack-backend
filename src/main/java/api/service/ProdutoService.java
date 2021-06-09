package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.Produto;
import api.repository.ProdutoRepository;

@Service
public class ProdutoService extends AbstractService<ProdutoRepository, Produto, UUID> {

}
