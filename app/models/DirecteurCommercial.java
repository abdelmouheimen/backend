package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@SuppressWarnings("serial")
@Entity
public class DirecteurCommercial extends Model {
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public String login;
    public String passwd;
    public Long tel;
    @OneToOne(mappedBy="dc")
    public ChefDepartementDirect cdd;
    @OneToOne(mappedBy="dc")
    public ChefDepartementIndirect cdi;
}