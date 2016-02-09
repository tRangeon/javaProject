package projet;

/**
 * Objets qui peuvent interagir avec le joueur
 * 
 * @author isen
 *
 */
public class Objet {

	private int identifiant;
	private String nom;
	private Effet effet;
	private ParametresObjet parametresObjet;

	/**
	 * Constructeur de la classe Objet
	 * 
	 * @param identifiant
	 * @param nom
	 * @param effet
	 * @param parametresObjet
	 */
	public Objet(int identifiant, String nom, Effet effet, ParametresObjet parametresObjet) {
		setIdentifiant(identifiant);
		setNom(nom);
		setEffet(effet);
		setParametresObjet(parametresObjet);
	}

	/**
	 * Methode qui permet de mettre en oeuvre le comportement de l'objet
	 */
	public void interagir() {
		this.effet.interaction(this);
	}

	/**
	 * @return the identifiant
	 */
	public int getIdentifiant() {
		return identifiant;
	}

	/**
	 * @param identifiant
	 *            the identifiant to set
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
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the effet
	 */
	public Effet getEffet() {
		return effet;
	}

	/**
	 * @param effet
	 *            the effet to set
	 */
	public void setEffet(Effet effet) {
		this.effet = effet;
	}

	/**
	 * @return the parametresObjet
	 */
	public ParametresObjet getParametresObjet() {
		return parametresObjet;
	}

	/**
	 * @param parametresObjet
	 *            the parametresObjet to set
	 */
	public void setParametresObjet(ParametresObjet parametresObjet) {
		this.parametresObjet = parametresObjet;
	}

}
