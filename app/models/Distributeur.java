package models;

        import play.db.ebean.Model;

        import javax.persistence.Entity;
        import javax.persistence.Id;
        import javax.persistence.ManyToMany;
        import java.util.List;

/**
 * Created by Dell on 28/03/2015.
 */
@Entity
public class Distributeur  extends Model{
    @Id
    public Long id;
    public String nom;
    public String prenom;
    public String passwd;
    public Long   tel;
    public Float pond;
    @ManyToMany(mappedBy="distributeur")
    public List<CommissionnementDistributeur> cd;
    @ManyToMany(mappedBy="distributeur")
    public List<Produit> produit;
    @ManyToMany(mappedBy="distributeur")
    public List<Client> client;
}
