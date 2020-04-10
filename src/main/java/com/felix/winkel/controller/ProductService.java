package com.felix.winkel.controller;

import com.felix.winkel.domein.Bestelling;
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

    @Autowired
    BestellingRepository br;



    public Iterable<Product> alleProducten(){
        return pr.findAll();
    }
    public void maakProductAan(Product product){
         pr.save(product);  // wel of niet aanwezigheid van de identifier

    }

    public void verwijderProductMetId(long productId){
        pr.deleteById(productId);
    }
    public void uitproberen(){
        System.out.println("Het is begonnen");
        Bestelling b = new Bestelling();
        Product p = new Product();
        pr.save(p);
        b.setProduct(p);
        br.save(b);

    }

}
