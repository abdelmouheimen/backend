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
public class Produit extends Model {
    @Id
    public Long id;
    public String type;
    @OneToMany(mappedBy="produit")
    List<Objectifs> objectifs;
}
