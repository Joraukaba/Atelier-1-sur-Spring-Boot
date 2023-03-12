package com.atelier1.produit;

import com.atelier1.produit.Models.Produit;
import com.atelier1.produit.Repository.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ProduitApplicationTests {

    @Autowired
    ProduitRepository produitRepository;

//    methode pour persiste un objet dans la base des donnees
    @Test
    public void testCreate(){
        Produit p = new Produit("Mirinda","energetique gaz",1500.00, new Date());
        produitRepository.save(p);
    }

//    methode qui find ou trouve un produit par son id
    @Test
    public void testFindById(){
        Produit p1 = produitRepository.findById(2L).get();
        System.out.println(p1);
    }

//    methode pour mettre en jour le produit par Id
    @Test
    public void testUpdate(){
        Produit ps = produitRepository.findById(1L).get();
        ps.setPrix(100.30);
        ps.setNomProduit("Mangue");
        produitRepository.save(ps);
    }

//    methode qui nous permet de liste tout le produit
    @Test
    public void getAllproduit(){
      List<Produit> getp = produitRepository.findAll();
      for(Produit ps : getp){
          System.out.println(ps);
      }
    }

//    methode qui nous permet de supprimer un produit par rapport a son Id
    @Test
    public void testDelete(){

        produitRepository.deleteById(2L);
//        return  "Suppression recu avec succes";
    }
}
