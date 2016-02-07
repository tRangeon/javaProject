package projet;

import java.util.*;

public class MaitreDuJeu {

    private int victoire = -1;
    private Joueur joueur;
    private ArrayList<Piece> pieces;

    public MaitreDuJeu() {
        setVictoire(-1);
    }

    public void deplacerPNJ(PNJ pnj, Piece destination) {
        if (destination.acceder() == true) {
            int index;
            for (index = 0; index < pieces.size(); index++) {
                if (pieces.get(index).getPNJs().contains(pnj)) {
                    pieces.get(index).retirerPNJ(pnj);
                }
                destination.ajouterPNJ(pnj);
            }
        } else {
            System.out.println("Accès refusé !");
        }
    }
    
    public void deplacerJoueur(Joueur joueur, Piece destination){
        if (destination.acceder() == true) {
            joueur.setPosition(destination);
        } else {
            System.out.println("Acces refusé !");
        }
    }

    public void jouerUnTour() {
        System.out.println("ATTENTION: Methode jouerUnTour pas implémentée !");
        System.out.println(joueur.getNom() + " est dans la pièce: " + joueur.getPosition().getNom());
        System.out.print("Personnages présents: ");
        joueur.getPosition().afficherPNJs();
        System.out.println("Objets à disposition: !!! METHODE PAS ENCORE ECRITE !!!");
        
    }

    /**
     * @return the victoire
     */
    public int getVictoire() {
        return victoire;
    }

    /**
     * @param victoire the victoire to set
     */
    public void setVictoire(int victoire) {
        this.victoire = victoire;
    }

    /**
     * @return the joueur
     */
    public Joueur getJoueur() {
        return joueur;
    }

    /**
     * @param joueur the joueur to set
     */
    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    /**
     * @return the pieces
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * @param pieces the pieces to set
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

}
