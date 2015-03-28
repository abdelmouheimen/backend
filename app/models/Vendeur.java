package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 28/03/2015.
 */
@Entity
public interface Vendeur {
    @Id
    public Long id= Long.valueOf(0);
    public String nom="";
    public String prenom="";
    public String passwd="";
    public Long tel=Long.valueOf(0);
    @ManyToMany(mappedBy="vendeur")
    public List<Commissionnnement> commissionnnement =  new ArrayList<Commissionnnement>();
    @ManyToMany
    public List<Produit> produit = new ArrayList<Produit>();
    @ManyToMany
    public List<Client> client = new ArrayList<Client>();
}
