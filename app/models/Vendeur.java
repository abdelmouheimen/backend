package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Dell on 05/04/2015.
 */
@Entity
public class Vendeur extends Model {
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public String login;
    public Double salaire;
    public String passwd;
    public Long   tel;
    @OneToMany
    public List<Objectifs> objectifs;
}
