package com.product.demo.repositories;

import org.springframework.data.repository.CrudRepository;


import com.product.demo.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
