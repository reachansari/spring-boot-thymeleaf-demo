package com.product.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.product.demo.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
