package com.example.projekat5.repositories;

import com.example.projekat5.entities.Article;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ArticleImplementation implements ArticleRepository{

    public List<Article>articles=new ArrayList<>();
    public ArticleImplementation() {
        initArticles();
    }
    private void initArticles(){
        String text = "Danas sam radio zadatke.";
        Article article = new Article(0,"Veb programiranje", text, "Mateja Civkaroski");
        String tekst2 = "Ovo je neki random article za testirane da li radi fetch zahtev za article.";
        Article article1 = new Article(1, "Random article", tekst2, "Student Studentic");
        List<String> koms = new ArrayList<>();
        koms.add("Mateja Civ:Dobra objava");
        koms.add("NN:kakva objava");
        koms.add("ASDAD:etet dadsda");
        koms.add("DDDDD:sdsdaq ssdaqw");
        article.setDatum( new Date(2023-1900, 2, 23));

        article.setListaKomentara(koms);
        articles.add(article);
        articles.add(article1);
    }

    @Override
    public synchronized Article dodavanjePosta(Article article) {
        Integer id = articles.size();
        Article novi = new Article();
        novi.setTitle(article.getTitle());
        novi.setAutor(article.getAutor());
        novi.setText(article.getText());
        novi.setId(id);
        article.setId(id);
        articles.add(Math.toIntExact(id), novi);

        return novi;

    }

    @Override
    public List<Article> pregledPostova() {
        return new ArrayList<>(articles);
    }

    @Override
    public void dodavanjeKomentara(String ime, String komentar,Integer id) {

        this.articles.get(id).getListaKomentara().add(ime);

    }

    @Override
    public Article pregledPojedinacnogPosta(Integer id) {
        return this.articles.get(id);
    }

    @Override
    public Article dodajKomentar(Integer id, Article article) {
        this.articles.set(id, article);
        return this.articles.get(id);

    }
}
