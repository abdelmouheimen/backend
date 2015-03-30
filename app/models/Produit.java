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
public class Produit extends Model {
    @Id
    public Long id;
    public String type;
    @ManyToMany
    public List<Conseiller> conseiller;
    @ManyToMany
    public List<Pdv> pdv;
    @ManyToMany
    public List<Distributeur> distributeur;
    @ManyToMany(mappedBy="produit")
    public List<CommissionnementConseiller> cc;
    @ManyToMany(mappedBy="produit")
    public List<CommissionnementDistributeur> cd;
    @ManyToMany(mappedBy="produit")
    public List<CommissionnementPdv> cp;
    @ManyToMany(mappedBy="produit")
    public List<Client> client;
}
