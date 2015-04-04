package models;

import play.db.ebean.Model;

import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Dell on 28/03/2015.
 */
public class ChefServiceMagasin extends Model {
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public String login;
    public Double salaire;
    public String passwd;
    public Long tel;
    public Double pond;
    @OneToOne
    public ChefDepartementIndirect cdi;
}
