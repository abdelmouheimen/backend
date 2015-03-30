package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Dell on 28/03/2015.
 */
@Entity
public class Boutique extends Model {
    @Id
    public Long id;
    public String zone;
    public Integer nbConseillers;
    @ManyToOne
    public ResponsableRegionalBoutique rgb;
    @OneToMany(mappedBy="boutique")
    public List<Conseiller> conseiller;
}
