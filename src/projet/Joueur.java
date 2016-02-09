package projet;

import java.util.*;

/**
 * Joueur avec lequel l'utilisateur joue la partie
 * 
 * @author Thomas
 *
 */
public class Joueur extends Personnage {

	private Piece position;

	/**
	 * Constructeur de Joueur par défaut, il faut seulement renseigner le nom du
	 * joueur
	 *
	 * @param nom
	 */
	public Joueur(String nom) {
		setIdentifiant(0);
		setNom(nom);
		setAge(20);
		setSexe(1);
		setArgent(100);
		setSucces(new ArrayList<String>());
		setPosition(new Piece(0, "Piece par défaut"));
	}

	/**
	 * Constructeur du Joueur, il faut renseigner toutes les valeurs des
	 * attributs du joueur
	 *
	 * @param identifiant
	 * @param nom
	 * @param age
	 * @param sexe
	 * @param argent
	 * @param position
	 */
	public Joueur(int identifiant, String nom, int age, int sexe, int argent, Piece position) {
		setIdentifiant(identifiant);
		setNom(nom);
		setAge(age);
		setSexe(sexe);
		setArgent(argent);
		setSucces(new ArrayList<String>());
		setPosition(position);
	}

	/**
	 * @return the position
	 */
	public Piece getPosition() {
		return position;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(Piece position) {
		this.position = position;
	}

}
