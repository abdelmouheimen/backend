package models;

import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Dell on 28/03/2015.
 */
public class ChefServiceMagasin {
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public String passwd;
    public Long tel;
    @OneToOne
    public ChefDepartementIndirect cdi;
}
