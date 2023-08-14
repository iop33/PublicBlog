package com.example.projekat5.repositories;

import com.example.projekat5.entities.Article;

import java.util.List;

public interface ArticleRepository {


    public Article dodavanjePosta(Article article);
    public List<Article> pregledPostova();
    public void dodavanjeKomentara(String ime,String komentar,Integer id);
    public Article pregledPojedinacnogPosta(Integer id);
    public Article dodajKomentar(Integer id, Article article);



}
