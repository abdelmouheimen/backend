package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@SuppressWarnings("serial")@Entity
public class ChefDepartementIndirect extends Model {
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
    public DirecteurCommercial dc;
    @OneToOne(mappedBy="cdi")
    public ChefServiceDistribution csd;
    @OneToOne(mappedBy="cdi")
    public ChefServiceMagasin csm;
    @OneToOne(mappedBy="cdi")
    public ChefServicePdv csp;

    public static Finder<Long, ChefDepartementIndirect> find() {
        return new Finder<Long, ChefDepartementIndirect>(Long.class, ChefDepartementIndirect.class);
    }
}
