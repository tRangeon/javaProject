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
            }
            destination.ajouterPNJ(pnj);
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
            System.out.println("\n----- Felicitations tu as gagné le jeu ! -----\n");

        } else if (victoire == 0) {
            System.out.println("\n----- Game Over - Tu as perdu ! -----\n");

        } else {
            System.out.println("\n----- Description du lieu -----");
            Scanner scanner = new Scanner(System.in);

            System.out.println(joueur.getNom() + " est dans la pièce: " + joueur.getPosition().getNom());
            System.out.print("Personnages présents: ");
            joueur.getPosition().afficherPNJs();
            System.out.print("Objets dans la pièce: ");
            joueur.getPosition().afficherObjets();

            attenteAppuiToucheEntrer();

            // Utiliser un try catch ici pour les entrées du l'utilisateur !
            System.out.println("\nQue voulez vous faire ?\n\n1 - Parler à un personnage\n2 - Interagir avec un objet\n3 - Se déplacer\n4 - Gagner jeu [TEMPORAIRE]");
            System.out.print("\nRéponse: ");
            int reponse = scanner.nextInt();
            switch (reponse) {
                case 1:
                    selectionPNJ(joueur.getPosition().getPNJs());
                    break;
                case 2:
                    selectionObjet(joueur.getPosition().getObjets());
                    break;
                case 3:
                    System.out.println("Le joueur se déplace [NON IMPLEMENTE]");
                    break;
                case 4:
                    setVictoire(1);
                    break;

            }
        }

    }

    public void selectionPNJ(ArrayList<PNJ> liste) {
        if (liste.size() <= 0) {
            System.out.println("Il n'y a personne à qui parler ...");
        } else {
            System.out.println("A qui voulez vous parler ?");
            int index;
            for (index = 0; index < liste.size(); index++) {
                System.out.println((index + 1) + " - " + liste.get(index).getNom());
            }
            System.out.print("\nReponse:");

            Scanner scanner = new Scanner(System.in);
            int reponse = scanner.nextInt();
            liste.get(reponse - 1).interagir();

        }
        attenteAppuiToucheEntrer();
    }

    public void selectionObjet(ArrayList<Objet> liste) {
        if (liste.size() <= 0) {
            System.out.println("Il n'y a aucun objet ici ...");
        } else {
            System.out.println("Quel objet voulez vous utiliser ?");
            int index;
            for (index = 0; index < liste.size(); index++) {
                System.out.println((index + 1) + " - " + liste.get(index).getNom());
            }
            System.out.print("\nReponse:");

            Scanner scanner = new Scanner(System.in);
            int reponse = scanner.nextInt();
            liste.get(reponse - 1).interagir();

        }
        attenteAppuiToucheEntrer();
    }

    public void attenteAppuiToucheEntrer() {
        System.out.print("\n[Appuyez sur entrer pour continuer]");
        Scanner scannerEtapeSuivante = new Scanner(System.in);
        scannerEtapeSuivante.nextLine();
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
