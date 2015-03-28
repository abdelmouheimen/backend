package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;


@SuppressWarnings("serial")@Entity
public class ChefDepartementDirect extends Model {
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public String passwd;
    public Long tel;
    @OneToOne
    public DirecteurCommercial dc;
    @OneToMany(mappedBy="cdd")
    public List<ResponsableRegionalBoutique> rgb;
}
