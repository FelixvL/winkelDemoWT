package com.felix.winkel.rest;

import com.felix.winkel.controller.ProductService;
import com.felix.winkel.domein.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductEndpoint {
    @Autowired
    ProductService ps;

    @GetMapping("/alleproducten")
    public Iterable<Product> verkrijgAlleProducten(){
        System.out.println("in endpoint alle producten");
        return ps.alleProducten();
    }

    @PostMapping("/maakproductaan")
    public String maakproductaan(  @RequestBody Product product  ){
        ps.maakProductAan(product);
        return "product aangemaakt";
    }

    @DeleteMapping("/productverwijderen/{productId}")
    public String productVerwijderen(@PathVariable int productId){
        System.out.println(">>"+productId);
        return "gelukt";
    }
    @DeleteMapping("/productverwijderentrial/{productId}")
    public String productVerwijderenTrial(@PathVariable int productId){
        System.out.println(">>"+productId);
        return "gelukt";
    }
}
