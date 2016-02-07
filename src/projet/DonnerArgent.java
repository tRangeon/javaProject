package projet;

public class DonnerArgent implements Comportement {

	private Joueur joueur;
        private int montant;
	private int contexte;

	public DonnerArgent(Joueur joueur, int montant, int contexte) {
            this.montant = montant;
            this.contexte = contexte;
            this.joueur = joueur;
	}

	public void interaction(PNJ cePNJ) {
            System.out.println(cePNJ.getRepliques().getDonsArgent().get(contexte) + "\n");
            cePNJ.transaction(joueur, montant);
            joueur.afficherArgent();

        // Définit le comportement qu'aura le PNJ au tour suivant
            // A ECRIRE !!!
        }
}
