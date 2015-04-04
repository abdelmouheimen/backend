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
}
