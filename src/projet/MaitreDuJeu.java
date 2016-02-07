package projet;

import java.util.*;
import java.util.Scanner;

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

    public void deplacerJoueur(Joueur joueur, Piece destination) {
        if (destination.acceder() == true) {
            joueur.setPosition(destination);
        } else {
            System.out.println("Acces refusé !");
        }
    }

    public void jouerUnTour() {
        if (victoire == 1) {
            System.out.println("\nFelicitations tu as gagné le jeu !");
        } else if (victoire == 0) {
            System.out.println("\nGame Over - Tu as perdu !");
        } else {

            Scanner scanner = new Scanner(System.in);

            System.out.println("ATTENTION: Methode jouerUnTour pas implémentée !");
            System.out.println(joueur.getNom() + " est dans la pièce: " + joueur.getPosition().getNom());
            System.out.print("Personnages présents: ");
            joueur.getPosition().afficherPNJs();
            System.out.print("Objets dans la pièce: ");
            joueur.getPosition().afficherObjets();

            // Utiliser un try catch ici pour les entrées du l'utilisateur !
            System.out.println("\nQue voulez vous faire ? [PAS IMPLEMENTE POUR L'INSTANT]\n1 - Parler à un personnage\n2 - Interagir avec un objet\n3 - Se déplacer\n4 - Gagner jeu [TEMPORAIRE]");
            System.out.print("Réponse: ");
            int reponse = scanner.nextInt();
            switch (reponse){
                case 4:
                    setVictoire(1);
                    break;
                    
            }
        }

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
