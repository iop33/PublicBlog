package com.example.projekat5.entities;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Article {

    private Integer id;
    @NotNull
    @NotEmpty(message="this field is required")
    private String title;
    @NotNull
    @NotEmpty(message="this field is required")
    private String text;
    private Date datum;
    @NotNull
    @NotEmpty(message="this field is required")
    private String autor;
    private ConcurrentHashMap<String,String>komentari;
    private List<String> listaKomentara;

    public Article() {
        this.datum=new Date();
        this.komentari=new ConcurrentHashMap<>();
        this.listaKomentara = new ArrayList<>();
    }

    public Article(Integer id, String title, String text, String autor) {
        this();
        this.id = id;
        this.title = title;
        this.text = text;
        this.autor = autor;
    }
    public void dodajKomentar(String ime,String komentar){
        this.komentari.put(ime,komentar);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ConcurrentHashMap<String, String> getKomentari() {
        return komentari;
    }

    public void setKomentari(ConcurrentHashMap<String, String> komentari) {
        this.komentari = komentari;
    }

    public List<String> getListaKomentara() {
        return listaKomentara;
    }

    public void setListaKomentara(List<String> listaKomentara) {
        this.listaKomentara = listaKomentara;
    }
}
