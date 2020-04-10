package com.felix.winkel.controller;

import com.felix.winkel.domein.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductRepository extends CrudRepository<Product, Long> {
    //1 via erfrelatie
    //2 via methodenamen naamanalyse reserveerdewoorden icm fieldnamen
    //3 via @query annotatie JPQL  -- SQL native

    //List<Product> findByBovenAchttienFalse();
    List<Product> findByNaamOrderByPrijsDesc(String naam);





}
