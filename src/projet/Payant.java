package projet;

public class Payant implements Acces {

	private int prixEntree;
	private Joueur joueur;

	/**
	 * Constructeur de l'accès Payant
	 * @param prixEntree
	 * @param joueur
	 */
	public Payant(int prixEntree, Joueur joueur) {
		setPrixEntree(prixEntree);
		setJoueur(joueur);
	}

	/**
	 * Methode accession qui renvoie un booléen indiquant si l'accès est autorisé ou non
	 * @param piece La pièce où l'on veut rentrer
	 * @return L'autorisation ou le refus de l'accès
	 */
	public boolean accession(Piece piece) {
		boolean acces;
		if (joueur.getArgent() >= prixEntree){ 
			joueur.modifierArgent(- prixEntree);
			joueur.afficherArgent();
			acces = true;
		} else{
			acces = false;
		}
		return acces;	
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
	 * @return the prixEntree
	 */
	public int getPrixEntree() {
		return prixEntree;
	}

	/**
	 * @param prixEntree the prixEntree to set
	 */
	public void setPrixEntree(int prixEntree) {
		this.prixEntree = prixEntree;
	}

}
