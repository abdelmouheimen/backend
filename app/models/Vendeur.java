package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dell on 05/04/2015.
 */
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
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

    public static Finder<Long, Vendeur> find() {
        return new Finder<Long, Vendeur>(Long.class, Vendeur.class);
    }
}
