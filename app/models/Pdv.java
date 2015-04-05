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
}
