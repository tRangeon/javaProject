package projet;

import java.util.*;
import java.util.Scanner;

public class MaitreDuJeu {

	private int victoire = -1;
	private Joueur joueur;
	private ArrayList<Piece> pieces;

	/**
	 * Constructeur du maitre du jeu, qui est l'objet qui manipule toutes les
	 * instances
	 */
	public MaitreDuJeu() {
		setVictoire(-1);
	}

	/**
	 * Methode qui permet au maitre du jeu de déplacer un PNJ dans une pièce. Le
	 * PNJ est ajouté à la nouvelle pièce, et retiré de l'ancienne pièce
	 * 
	 * @param pnj
	 * @param destination
	 */
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
			// Mettre une exception ici ?
		}
	}

	/**
	 * Methode qui permet de changer le joueur de pièce
	 * 
	 * @param joueur
	 * @param destination
	 */
	public void deplacerJoueur(Joueur joueur, Piece destination) {
		if (destination.acceder() == true) {
			joueur.setPosition(destination);
			System.out.println(joueur.getNom() + " se déplace dans la pièce: " + destination.getNom());
		} else {
			System.out.println("Acces refusé !");
		}
	}

	/**
	 * Methode qui permert de jouer un tour. Un tour est une action commandée
	 * par le joueur C'est cette méthode, utilisée en boucle qui permet de jouer
	 * au jeu.
	 */
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
			System.out.println(
					"\nQue voulez vous faire ?\n\n1 - Parler à un personnage\n2 - Interagir avec un objet\n3 - Se déplacer");
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
				selectionDeplacement(joueur.getPosition().getPiecesVoisines());
				break;

			}
			
		}

	}

        /**
         * permet de créer le joueur que vous voulez incarner
         * @return joueur 
         */
        public Joueur CreerJoueur() {
        	int age;
        	int sexe;
        	int argent;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Création du personnage");
            System.out.println("Nom du personnage:");
            String nom=scanner.next();
            System.out.println("Voulez vous personnaliser votre personnage (tapez 1) ou choisir les valeurs par défaut (tapez 2) ?");
            int reponse = scanner.nextInt();
            if (reponse == 1){
            	System.out.println("Age du personnage:");
                age=scanner.nextInt();
                System.out.println("Sexe du personnage: tapez 1 pour un homme ou 2 pour une femme:");
                sexe=scanner.nextInt();
                System.out.println("Argent du personnage;");
                argent=scanner.nextInt();
            } else{
            	age = 20;
            	sexe = 1;
            	argent = 500;
            }
            Joueur joueur= new Joueur(0, nom, age, sexe, argent, new Piece(0,"Pièce par défaut"));
            return joueur;
	}

	/**
	 * Methode qui permet de choisir avec quel personnage le joueur veut
	 * interagir
	 * 
	 * @param liste
	 */
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

	/**
	 * Methode qui permet de choisir avec quel objet le joueur veut interagir
	 * 
	 * @param liste
	 */
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
	

	/**
	 * Methode qui permet de choisir dans quel pièce le joueur va se déplacer
	 * @param piecesVoisines
	 */
	public void selectionDeplacement(ArrayList<Piece> piecesVoisines){
		if (piecesVoisines.size() <= 0) {
			System.out.println("Il n'y a aucun endroit où aller ...");
		} else {
			System.out.println("Où souhaitez vous allez ?");
			int index;
			for (index = 0; index < piecesVoisines.size(); index++) {
				System.out.println((index + 1) + " - " + piecesVoisines.get(index).getNom());
			}
			System.out.print("\nReponse:");

			Scanner scanner = new Scanner(System.in);
			int reponse = scanner.nextInt();
			deplacerJoueur(joueur, piecesVoisines.get(reponse - 1));

		}
		attenteAppuiToucheEntrer();
	}

	/**
	 * Methode qui attend que l'utilisateur appuie sur la touche "Entrer"
	 */
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
	 * @param victoire
	 *            the victoire to set
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
	 * @param joueur
	 *            the joueur to set
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
	 * @param pieces
	 *            the pieces to set
	 */
	public void setPieces(ArrayList<Piece> pieces) {
		this.pieces = pieces;
	}

}
