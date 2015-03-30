package models;

import play.db.ebean.Model;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by Dell on 28/03/2015.
 */
public class ChefServicePdv extends Model {
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public String passwd;
    public Long tel;
    public Float pond;
    @OneToOne
    public ChefDepartementIndirect cdi;
    @OneToMany(mappedBy="csp")
    public List<ResponsableRegionalPdv> rgp;
}
