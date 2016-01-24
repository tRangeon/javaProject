package projet;

import java.util.*;

public class Joueur extends Personnage {

    private int position = 0;

    /**
     * Constructeur de Joueur par défaut, il faut seulement renseigner le nom du joueur
     * @param nom 
     */
    public Joueur(String nom) {
        setIdentifiant(0);
        setNom(nom);
        setAge(20);
        setSexe(1);
        setArgent(100);
        setSucces(new ArrayList<String>());
        setPosition(0);
    }

    /**
     * Constructeur du Joueur, il faut renseigner toutes les valeurs des attributs du joueur
     * @param identifiant
     * @param nom
     * @param age
     * @param sexe
     * @param argent 
     * @param position 
     */
    public Joueur(int identifiant, String nom, int age, int sexe, int argent, int position) {
        setIdentifiant(0);
        setNom(nom);
        setAge(20);
        setSexe(1);
        setArgent(100);
        setSucces(new ArrayList<String>());
        setPosition(position);
    }

    /**
     * @return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int position) {
        this.position = position;
    }

}
