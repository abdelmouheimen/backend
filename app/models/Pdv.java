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
public class Pdv extends Model{
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public String passwd;
    public Long   tel;
    public Float pond;
    @ManyToMany(mappedBy="pdv")
    public List<CommissionnementPdv> cp;
    @ManyToMany(mappedBy="pdv")
    public List<Produit> produit;
    @ManyToMany(mappedBy="pdv")
    public List<Client> client;
}
