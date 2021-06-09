package api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import api.model.Telefone;
import api.repository.TelefoneRepository;

@Service
public class TelefoneService extends AbstractService<TelefoneRepository, Telefone, UUID> {

}
