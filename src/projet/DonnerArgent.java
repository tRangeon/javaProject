package projet;

/**
 * Comportement d'un PNJ: Donner de l'argent
 * 
 * @author isen
 *
 */
public class DonnerArgent implements Comportement {

	private Joueur joueur;
	private int montant;
	private int contexte;

	/**
	 * Constructeur du comportement DonnerArgent Le PNJ donnera de l'argent au
	 * joueur, selon le contexte il peut: -faire un simple don (contexte = 0)
	 * -faire un remboursement au joueur (contexte = 1)
	 * 
	 * @param joueur
	 * @param montant
	 * @param contexte
	 *            0 = don; 1 = remboursement
	 */
	public DonnerArgent(Joueur joueur, int montant, int contexte) {
		this.montant = montant;
		this.contexte = contexte;
		this.joueur = joueur;
	}

	/**
	 * Methode qui met en ouevre le comportement DonnerArgent
	 * 
	 * @param cePNJ
	 *            PNJ qui va donner l'argent
	 */
	public void interaction(PNJ cePNJ) {
		System.out.println(cePNJ.getRepliques().getDonsArgent().get(contexte));
		cePNJ.transaction(joueur, montant);
		joueur.afficherArgent();

		// Définit le comportement qu'aura le PNJ au tour suivant
		cePNJ.modifierComportement(3, 0, 0);

	}
}
