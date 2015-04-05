package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Dell on 28/03/2015.
 */
@Entity
public class Conseiller extends Vendeur{
    @ManyToOne
    public Boutique boutique;
    @ManyToOne
    public Franchise franchise;

    public static Finder<Long, Conseiller> find() {
        return new Finder<Long, Conseiller>(Long.class, Conseiller.class);
    }
}
