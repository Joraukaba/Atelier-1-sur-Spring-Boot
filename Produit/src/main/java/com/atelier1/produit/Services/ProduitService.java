package com.atelier1.produit.Services;

import com.atelier1.produit.Models.Produit;

import java.util.List;

public interface ProduitService {

    Produit saveProduit(Produit p);
    Produit updateProduit(Produit produit);
    void deteteProduit(Produit produit);
    void deteleById(Long idprduit);
    List<Produit> ListProduit();

}
