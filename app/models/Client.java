package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by Dell on 28/03/2015.
 */
@Entity
public class Client {
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public Long tel;
    public Long cin;
    public String adresse;
    @ManyToMany(mappedBy="client")
    public List<Vendeur> vendeur;
    @ManyToMany(mappedBy="client")
    public List<Produit> produit;
}
