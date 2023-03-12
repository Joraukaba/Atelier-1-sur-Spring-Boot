package com.atelier1.produit.API;


import com.atelier1.produit.Models.Produit;
import com.atelier1.produit.Repository.ProduitRepository;
import com.atelier1.produit.Services.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ProduitAPI {
ProduitService produitService;

@Autowired
ProduitRepository produitRepository;

    @GetMapping("/read")
    public List<Produit>getproduit(){
        List<Produit> ps = produitRepository.findAll();
        return ps;
    }


}
