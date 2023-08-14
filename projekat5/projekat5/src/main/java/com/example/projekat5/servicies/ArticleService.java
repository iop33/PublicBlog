package com.example.projekat5.servicies;

import com.example.projekat5.entities.Article;
import com.example.projekat5.repositories.ArticleRepository;

import javax.inject.Inject;
import java.util.List;

public class ArticleService {
    public ArticleService() {
    }
    @Inject
    private ArticleRepository articleRepository;
    /*
    public Article dodavanjePosta(Article article);
    public List<Article> pregledPostova();
    public void dodavanjeKomentara(String ime,String komentar,Integer id);
    public Article pregledPojedinacnogPosta(Integer id);
     */
    public Article dodavanjePosta(Article article){return this.articleRepository.dodavanjePosta(article);}
    public List<Article> pregledPostova(){return this.articleRepository.pregledPostova();}
    public void dodavanjeKomentara(String ime, String komentar, Integer id){
        this.articleRepository.dodavanjeKomentara(ime, komentar, id);
    }
    public Article pregledPojedinacnogPosta(Integer id){return this.articleRepository.pregledPojedinacnogPosta(id);}
    public Article dodajKomentar(Integer id, Article article){return this.articleRepository.dodajKomentar(id, article);}
}
