package projet;

/**
 * Comportement PNJ: Inviter
 * 
 * @author Thomas
 *
 */
public class Inviter implements Comportement {

	private MaitreDuJeu maitreDuJeu;
	private Joueur joueur;
	private Piece pieceDestination;

	/**
	 * Constructeur du comportement Inviter
	 * 
	 * @param maitreDuJeu
	 * @param joueur
	 * @param numeroPieceDestination
	 */
	public Inviter(MaitreDuJeu maitreDuJeu, Joueur joueur, int numeroPieceDestination) {
		setMaitreDuJeu(maitreDuJeu);
		setJoueur(joueur);

		int index;
		pieceDestination = joueur.getPosition(); // Par defaut, le joueur reste
													// dans la meme piece si le
													// numero de destination
													// donné est invalide
		for (index = 0; index < maitreDuJeu.getPieces().size(); index++) {
			if (maitreDuJeu.getPieces().get(index).getNumero() == numeroPieceDestination) {
				pieceDestination = maitreDuJeu.getPieces().get(index);
			}
		}

	}

	/**
	 * Methode interaction qui met en oeuvre le comportement Inviter
	 * 
	 * @param cePNJ
	 *            PNJ qui va inviter le joueur
	 */
	public void interaction(PNJ cePNJ) {
		System.out.println(cePNJ.getRepliques().getInvitations().get(0));
		maitreDuJeu.deplacerJoueur(joueur, pieceDestination);
		maitreDuJeu.deplacerPNJ(cePNJ, pieceDestination);

		// Définit le comportement du PNJ au prochain tour
		cePNJ.modifierComportement(3, 0, 0);
	}

	/**
	 * @return the maitreDuJeu
	 */
	public MaitreDuJeu getMaitreDuJeu() {
		return maitreDuJeu;
	}

	/**
	 * @param maitreDuJeu
	 *            the maitreDuJeu to set
	 */
	public void setMaitreDuJeu(MaitreDuJeu maitreDuJeu) {
		this.maitreDuJeu = maitreDuJeu;
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
	 * @return the pieceDestination
	 */
	public Piece getPieceDestination() {
		return pieceDestination;
	}

	/**
	 * @param pieceDestination
	 *            the pieceDestination to set
	 */
	public void setPieceDestination(Piece pieceDestination) {
		this.pieceDestination = pieceDestination;
	}

}
