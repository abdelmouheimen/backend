package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by Dell on 30/03/2015.
 */
@Entity
public class CommissionnementDistributeur extends Model {
    @Id
    public Long id;
    public Long objectif;
    public Long realisation;
    public Float commission;
    @ManyToMany
    public List<Produit> produit;
    @ManyToMany
    public List<Distributeur> distributeur;
}

