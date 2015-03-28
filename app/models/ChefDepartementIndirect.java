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
    public String passwd;
    public Long tel;
    @OneToOne
    public DirecteurCommercial dc;
    @OneToOne(mappedBy="cdi")
    public ChefServiceDistribution csd;
    @OneToOne(mappedBy="cdi")
    public ChefServiceMagasin csm;
    @OneToOne(mappedBy="cdi")
    public ChefServicePdv csp;
}
