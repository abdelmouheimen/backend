package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Dell on 28/03/2015.
 */
@Entity
public class Pdv extends Vendeur{
    public Float pond;
    @ManyToOne
    public ResponsableRegionalPdv  rgp;

    public static Finder<Long, Pdv> find() {
        return new Finder<Long, Pdv>(Long.class, Pdv.class);
    }
}
