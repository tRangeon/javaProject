package projet;

/**
 * Comportement d'un PNJ: Discuter
 * 
 * @author Thomas
 *
 */
public class Discuter implements Comportement {

	private Joueur joueur;

	/**
	 * Constructeur du comportement Discuter
	 * 
	 * @param joueur
	 */
	public Discuter(Joueur joueur) {
		setJoueur(joueur);
	}

	/**
	 * Methode qui met en oeuvre le comportement Discuter
	 * 
	 * @param cePNJ
	 *            Le PNJ avec qui le joueur va discuter
	 */
	public void interaction(PNJ cePNJ) {
		int nbreDiscussions = cePNJ.getRepliques().getDiscussions().size();
		int repliqueAleatoire = (int) (Math.random() * 100) % nbreDiscussions;

		System.out.println(cePNJ.getRepliques().getDiscussions().get(repliqueAleatoire));

		// Définit le comportement qu'aura le PNJ au tour suivant
		int comportementSuivant = (int) (Math.random() * 100) % 10;
		int montantAleatoire = (int) (Math.random() * 100 + 1) % joueur.getArgent();
		switch (comportementSuivant) {

		// Comportement Inviter
		case 0:
			cePNJ.modifierComportement(0, 0, 0);
			break;

		// Comportement DonnerArgent (contexte 0 = simple don)
		case 1:
			cePNJ.modifierComportement(1, montantAleatoire, 0);
			break;

		// Comportement PrendreArgent (contexte 0 = vol d'argent)
		case 2:
			cePNJ.modifierComportement(2, joueur.getArgent(), 0);
			break;

		// Comportement PrendreArgent (contexte 1 = demande de pret)
		case 3:
			cePNJ.modifierComportement(2, montantAleatoire, 1);
			break;

		default:
			// On ne change pas le comportement

		}

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
}
