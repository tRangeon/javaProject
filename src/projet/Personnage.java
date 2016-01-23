package projet;

import java.io.*;
import java.util.*;

public abstract class Personnage {

	private int identifiant;
	private String nom;
	private int age;
	private int sexe;
	private int argent;
	private ArrayList<String> succes;

	public void modifierArgent(int montant) {
                System.out.println("Je modifie l'argent de " + this.getNom() + " de " + montant + " euros");
                System.out.println("%%% Ne pas oublier d'implementer la methode modifier.argent() dans Personnage %%%");
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
