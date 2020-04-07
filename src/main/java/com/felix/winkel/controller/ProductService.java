package com.felix.winkel.controller;

import com.felix.winkel.domein.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.felix.winkel.controller.ProductRepository;

@Service
@Transactional
public class ProductService {
    @Autowired
    ProductRepository pr;

    public Iterable<Product> alleProducten(){
        return pr.findAll();
    }
    public void maakProductAan(Product product){
         pr.save(product);
    }

}
