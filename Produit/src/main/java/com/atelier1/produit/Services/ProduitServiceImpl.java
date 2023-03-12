package com.atelier1.produit.Services;

import com.atelier1.produit.Models.Produit;
import com.atelier1.produit.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProduitServiceImpl implements ProduitService{

    @Autowired
    ProduitRepository produitRepository;

    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public void deteteProduit(Produit produit) {
    produitRepository.delete(produit);
    }

    @Override
    public void deteleById(Long idprduit) {
    produitRepository.deleteById(idprduit);
    }

    @Override
    public List<Produit> ListProduit() {
        return produitRepository.findAll();
    }
}
