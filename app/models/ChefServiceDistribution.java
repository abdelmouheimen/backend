package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by Dell on 28/03/2015.
 */
@Entity
public class ChefServiceDistribution {
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public String passwd;
    public Long tel;
    @OneToOne
    public ChefDepartementDirect cdd;
    @OneToMany(mappedBy="csd")
    public List<ResponsableRegionalDistribution> rgd;
}
