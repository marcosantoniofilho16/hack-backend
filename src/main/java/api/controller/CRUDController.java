package api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import api.service.CRUDService;

public class CRUDController<S extends CRUDService<T, ID>, T, ID> {
	
	@Autowired
	S service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public T save(@RequestBody T entity) {
		return service.save(entity);
	}
	
	@GetMapping
	public Page<T> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<T> findById(@PathVariable ID id) {
		return service.findById(id)
				.map(entity -> ResponseEntity.ok().body(entity))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("{id}")
	public ResponseEntity<T> put(@PathVariable ID id, @RequestBody T entity) {
		return service.findById(id)
				.map(savedEntity -> ResponseEntity.ok().body(service.put(savedEntity, entity)))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PatchMapping("{id}")
	public ResponseEntity<T> patch(@PathVariable ID id, @RequestBody T entity) {
		return service.findById(id)
				.map(savedEntity -> ResponseEntity.ok().body(service.patch(savedEntity, entity)))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Object> delete(@PathVariable ID id) {
		return service.findById(id)
				.map(entity -> ResponseEntity.noContent().build())
				.orElse(ResponseEntity.notFound().build());
	}

}
