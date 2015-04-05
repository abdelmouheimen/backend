package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Dell on 28/03/2015.
 */
@Entity
public class Distributeur  extends Vendeur{
    public Double pond;
    @ManyToOne
    public ResponsableRegionalDistribution rgd;

    public static Finder<Long, Distributeur> find() {
        return new Finder<Long, Distributeur>(Long.class, Distributeur.class);
    }
}
