package projet;

/**
 * Classe qui contient les parametres des objets
 * 
 * @author Thomas
 *
 */
public class ParametresObjet {

	private String affichageTexte;
	private String ouverturePiece;
	private String finDuJeu;

	/**
	 * Constructeur par défaut de la classe ParametresObjet, qui contient les
	 * différents textes à afficher selon l'effet de l'objet
	 */
	public ParametresObjet() {
		setAffichageTexte("Il ne se passe pas grand chose ...");
		setOuverturePiece("Génial, je peux ouvrir une pièce avec ça ! Mais laquelle ... ?");
		setFinDuJeu("T'es un champion !");
	}

	/**
	 * Constructeur de la classe ParametresObjet, qui contient les différents
	 * textes à afficher selon l'effet de l'objet
	 */
	public ParametresObjet(String affichageTexte, String ouverturePiece, String finDuJeu) {
		setAffichageTexte(affichageTexte);
		setOuverturePiece(ouverturePiece);
		setFinDuJeu(finDuJeu);
	}

	/**
	 * @return affichageTexte
	 */
	public String getAffichageTexte() {
		return affichageTexte;
	}

	/**
	 * 
	 * @param affichageTexte
	 */
	public void setAffichageTexte(String affichageTexte) {
		this.affichageTexte = affichageTexte;
	}

	/**
	 * @return ouverturePiece
	 */
	public String getOuverturePiece() {
		return ouverturePiece;
	}

	/**
	 * 
	 * @param ouverturePiece
	 */
	public void setOuverturePiece(String ouverturePiece) {
		this.ouverturePiece = ouverturePiece;
	}

	/**
	 * @return finDuJeu
	 */
	public String getFinDuJeu() {
		return finDuJeu;
	}

	/**
	 * 
	 * @param finDuJeu
	 */
	public void setFinDuJeu(String finDuJeu) {
		this.finDuJeu = finDuJeu;
	}

}
