package com.atelier1.produit.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Date;

@Entity
@Setter
@Data
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long idProduit;
    @NonNull
    private String nomProduit;
    @NonNull
    private String descriptionProduit;
    @NonNull
    private double prix;
    @NonNull
    private Date datecreation;
}
