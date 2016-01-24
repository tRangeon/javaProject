package projet;

import java.util.*;

/**
 * Classe abstraite personnage, qui comprend le Joueur et les Personnages Non
 * Joueurs (PNJ)
 *
 * @author isen
 */
public abstract class Personnage {

    private int identifiant;
    private String nom;
    private int age;
    private int sexe;
    private int argent;
    private ArrayList<String> succes;

    /**
     * Methode autorise une transaction
     * Si le montant est positif le personnage recoit de l'argent, s'il est négatif le personnage donne de l'argent
     *
     * @param montant
     * @return autorisation Booleen qui indique si la transation est autorisee ou non (true = autorisée; false = refusée)
     */
    public boolean autorisationTransaction(int montant) {
        boolean autorisation;

        if (montant < 0) {                    // Cas ou on veut débiter de l'argent
            if (argent + montant < 0) {          // Si les fonds sont inssufisants, alors on refuse la transaction
                autorisation = false;
            } else {                             // sinon on l'autorise
                autorisation = true;
            }
        } else {                             // Cas ou on veut recevoir de l'argent, on autorise systematiquement
            autorisation = true;
        }
        return autorisation;
    }
    
    /**
     * Methode qui modifie l'argent du personnage
     * Si le montant est positif le personnage recoit de l'argent, s'il est négatif il en perd
     * Il est très fortement conseillé de vérifier avant que le personnage peut assumer cette transation
     * en utilisant la methode autorisationTransaction(montant), sinon il risque d'avoir un niveau d'argent négatif
     * @param montant 
     */
    public void modifierArgent(int montant){
        System.out.println("[" + nom + ((montant > 0) ? " gagne " : " perd ") + (montant) + " euros]");
        setArgent(argent + montant);
        afficherArgent();
    }

    /**
     * Methode qui affiche l'argent que possede le personnage
     */
    public void afficherArgent() {
        System.out.println("[Argent de " + nom + ": " + argent + " euros]");
    }

    /**
     * Méthode qui effectue une transaction entre deux personnages
     * Si le montant est positif, le personnage appelant la méthode va donner de l'argent au
     * personnage donné en paramètre Si le montant est négatif, c'est l'inverse
     *
     * @param deuxiemePersonnage 
     * @param montant
     */
    public void transaction(Personnage deuxiemePersonnage, int montant) {
        boolean autorisationPersonnage1 = this.autorisationTransaction(-montant);
        boolean autorisationPersonnage2 = deuxiemePersonnage.autorisationTransaction(montant);
        
        if ( autorisationPersonnage1 && autorisationPersonnage2 ){      // Si la transaction est acceptée
            
            this.modifierArgent(-montant);
            deuxiemePersonnage.modifierArgent(montant);

        } else{                                                         // Si la transaction est refusée
            if(autorisationPersonnage1 == false){
                System.out.println(this.getNom() + " n'a pas assez d'argent ...");
            } else if(autorisationPersonnage2 == false){
                System.out.println(deuxiemePersonnage.getNom() + " n'a pas assez d'argent ...");
            }
        }
    }

    /**
     * @return the identifiant
     */
    public int getIdentifiant() {
        return identifiant;
    }

    /**
     * @param identifiant the identifiant to set
     */
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the sexe
     */
    public int getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the argent
     */
    public int getArgent() {
        return argent;
    }

    /**
     * @param argent the argent to set
     */
    public void setArgent(int argent) {
        this.argent = argent;
    }

    /**
     * @return the succes
     */
    public ArrayList<String> getSucces() {
        return succes;
    }

    /**
     * @param succes the succes to set
     */
    public void setSucces(ArrayList<String> succes) {
        this.succes = succes;
    }

}
