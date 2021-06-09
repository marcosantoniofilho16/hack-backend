package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.OpcionalProduto;
import api.repository.OpcionalProdutoRepository;

@Service
public class OpcionalProdutoService extends AbstractService<OpcionalProdutoRepository, OpcionalProduto, UUID> {

}
