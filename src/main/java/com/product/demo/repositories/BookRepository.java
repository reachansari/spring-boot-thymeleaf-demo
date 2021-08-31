package com.product.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.product.demo.model.Book;

public interface BookRepository extends CrudRepository<Book,Long> {


}
