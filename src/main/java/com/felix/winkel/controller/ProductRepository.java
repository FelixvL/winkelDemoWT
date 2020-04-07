package com.felix.winkel.controller;

import com.felix.winkel.domein.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProductRepository extends CrudRepository<Product, Long> {

}
