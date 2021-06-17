package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "commentaire")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentaire_id")
    private int commentaire_id;

    @Column(name = "contenu")
    private String contenu;

    @Column(name = "produit_id")
    private String produit_id;

    //Getters & Setters


    public int getCommentaire_id() {
        return commentaire_id;
    }

    public String getContenu() {
        return contenu;
    }

    public String getProduit_id() {
        return produit_id;
    }

    public void setCommentaire_id(int commentaire_id) {
        this.commentaire_id = commentaire_id;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setProduit_id(String produit_id) {
        this.produit_id = produit_id;
    }
}
