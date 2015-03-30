package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by Dell on 28/03/2015.
 */
@Entity
public class Client extends Model {
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public Long tel;
    public Long cin;
    public String adresse;
    @ManyToMany
    public List<Conseiller> conseiller;
    @ManyToMany
    public List<Pdv> pdv;
    @ManyToMany
    public List<Distributeur> distributeur;
    @ManyToMany
    public List<Produit> produit;
}
