package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Dell on 05/04/2015.
 */
@Entity
public class Objectifs extends Model {
    @Id
    public Long id;
    public Long objectif;
    public Long realisation;
    @ManyToOne
    public Vendeur vendeur;
    @ManyToOne
    public Produit produit;

    public static Finder<Long, Franchise> find() {
        return new Finder<Long, Franchise>(Long.class, Franchise.class);
    }
}
