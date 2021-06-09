package api.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CRUDService<T, ID> {
	
	Page<T> findAll(Pageable pageable);
	
	<S extends T> S save(S entity);
	
	<S extends T> S put(S savedEntity, S entity);
	
	<S extends T> S patch(S savedEntity, S entity);
	
	Optional<T> findById(ID id);
	
	void deleteById(ID id);

}
