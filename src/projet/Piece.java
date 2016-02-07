package projet;

import java.util.*;

public class Piece {

    private int numero = 0;
    private String nom = "Piece sans nom";
    private Acces acces;
    private ArrayList<PNJ> PNJs;
    private ArrayList<Objet> objets;

    public Piece(int numero, String nom) {
        setNumero(numero);
        setNom(nom);
        setAcces(new Ouvert());
        setPNJs(new ArrayList<PNJ>());
        setObjets(new ArrayList<Objet>());
    }

    public void ajouterPNJ(PNJ pnj) {
        if (getPNJs().contains(pnj)) {
            System.out.println("AJOUTER EXCEPTION: PNJ déjà présent dans la pièce");
        } else {
            getPNJs().add(pnj);
        }
    }

    public void retirerPNJ(PNJ pnj) {
        getPNJs().remove(pnj);
    }

    public boolean acceder() {
        return getAcces().accession(this);
    }
    
    public void afficherPNJ(){
        int index;
        for(index = 0; index < getPNJs().size(); index++){
            System.out.println(getPNJs().get(index).getNom());
        }
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
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
     * @return the acces
     */
    public Acces getAcces() {
        return acces;
    }

    /**
     * @param acces the acces to set
     */
    public void setAcces(Acces acces) {
        this.acces = acces;
    }

    /**
     * @return the PNJs
     */
    public ArrayList<PNJ> getPNJs() {
        return PNJs;
    }

    /**
     * @param PNJs the PNJs to set
     */
    public void setPNJs(ArrayList<PNJ> PNJs) {
        this.PNJs = PNJs;
    }

    /**
     * @return the objets
     */
    public ArrayList<Objet> getObjets() {
        return objets;
    }

    /**
     * @param objets the objets to set
     */
    public void setObjets(ArrayList<Objet> objets) {
        this.objets = objets;
    }

}
