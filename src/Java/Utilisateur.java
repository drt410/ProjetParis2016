package Java;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tran on 31/10/2016.
 */
@Entity
@Table(name = "UTILISATEUR")
@NamedQuery(name = "findUtilisateur", query = "SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String nom;
    private String motdePasse;
    private String type;


    public Utilisateur(String nom, String motdePasse, String type) {
        this.nom = nom;
        this.motdePasse = motdePasse;
        this.type = type;
    }

    public Utilisateur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotdePasse() {
        return motdePasse;
    }

    public void setMotdePasse(String motdePasse) {
        this.motdePasse = motdePasse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
