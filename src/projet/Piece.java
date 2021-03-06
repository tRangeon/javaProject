package projet;

import java.util.*;

/**
 * Pièce
 * 
 * @author Thomas
 *
 */
public class Piece {

	private int numero;
	private String nom;
	private Acces acces;
	private ArrayList<PNJ> PNJs;
	private ArrayList<Objet> objets;
	private ArrayList<Piece> piecesVoisines;

	/**
	 * Constructeur de la classe Piece
	 * 
	 */
	public Piece(int numero, String nom) {
		setNumero(numero);
		setNom(nom);
		setAcces(new Ouvert());
		setPNJs(new ArrayList<PNJ>());
		setObjets(new ArrayList<Objet>());
		setPiecesVoisines(new ArrayList<Piece>());
	}

	/**
	 * Methode qui permet d'ajouter un PNJ à une pièce
	 * 
	 * @param pnj
	 */
	public void ajouterPNJ(PNJ pnj) {
		if (getPNJs().contains(pnj)) {
			System.out.println("AJOUTER EXCEPTION: PNJ déjà présent dans la pièce");
		} else {
			getPNJs().add(pnj);
		}
	}

	/**
	 * Methode qui retire un PNJ d'une pièce
	 * 
	 * @param pnj
	 */
	public void retirerPNJ(PNJ pnj) {
		getPNJs().remove(pnj);
	}

	/**
	 * Methode qui ajoute un objet à une pièce
	 * 
	 * @param objet
	 */
	public void ajouterObjet(Objet objet) {
		getObjets().add(objet);
	}

	/**
	 * Indique si l'accès à la pièce est accepté ou non
	 * 
	 * @return true = accès accordé; false = accès refusé
	 */
	public boolean acceder() {
		return getAcces().accession(this);
	}

	/**
	 * Methode qui affiche les PNJ présents dans la pièce
	 */
	public void afficherPNJs() {
		int index;
		if (getPNJs().size() > 0) {
			for (index = 0; index < getPNJs().size() - 1; index++) {
				System.out.print(getPNJs().get(index).getNom() + ", ");
			}
			System.out.println(getPNJs().get(index).getNom());
		} else {
			System.out.println("Aucun personnage");
		}
	}

	/**
	 * Methode qui affiche les objets présents dans la pièce
	 */
	public void afficherObjets() {
		int index;
		if (getObjets().size() > 0) {
			for (index = 0; index < getObjets().size() - 1; index++) {
				System.out.print(getObjets().get(index).getNom() + ", ");
			}
			System.out.println(getObjets().get(index).getNom());
		} else {
			System.out.println("Aucun objet");
		}
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
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
	 * @param nom
	 *            the nom to set
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
	 * @param acces
	 *            the acces to set
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
	 * @param PNJs
	 *            the PNJs to set
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
	 * @param objets
	 *            the objets to set
	 */
	public void setObjets(ArrayList<Objet> objets) {
		this.objets = objets;
	}

	/**
	 * @return the piecesVoisines
	 */
	public ArrayList<Piece> getPiecesVoisines() {
		return piecesVoisines;
	}

	/**
	 * @param piecesVoisines
	 *            the piecesVoisines to set
	 */
	public void setPiecesVoisines(ArrayList<Piece> piecesVoisines) {
		this.piecesVoisines = piecesVoisines;
	}

}
