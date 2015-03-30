package models;

import play.db.ebean.Model;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Dell on 28/03/2015.
 */
public class ResponsableRegionalBoutique extends Model {
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public String passwd;
    public Long tel;
    @ManyToOne
    public ChefDepartementDirect cdd;
    @OneToMany(mappedBy="rgb")
    public List<Boutique> boutique;
    @OneToMany(mappedBy="rgb")
    public List<Franchise> franchise;
}
