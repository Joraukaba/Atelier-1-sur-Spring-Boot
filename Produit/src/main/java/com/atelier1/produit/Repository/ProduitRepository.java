package com.atelier1.produit.Repository;

import com.atelier1.produit.Models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository  extends JpaRepository<Produit,Long> {

}
