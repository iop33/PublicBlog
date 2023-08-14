package com.example.projekat5.resources;

import com.example.projekat5.entities.Article;
import com.example.projekat5.servicies.ArticleService;

import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/articles")

public class ArticleResource {



    @Inject
    private ArticleService articleService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response all(){return Response.ok(this.articleService.pregledPostova()).build();}

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Article create(@Valid Article article){ return this.articleService.dodavanjePosta(article);}

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Article find(@PathParam("id") Integer id){ return this.articleService.pregledPojedinacnogPosta(id); }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Article addComment(@PathParam("id") Integer id,@Valid Article article){ return this.articleService.dodajKomentar(id, article);}
}
