package projet;

public class PrendreArgent implements Comportement {

    private Joueur joueur;
    private int montant;
    private int contexte;

    public PrendreArgent(Joueur joueur, int montant, int contexte) {
        this.montant = montant;
        this.contexte = contexte;
        this.joueur = joueur;
    }

    public void interaction(PNJ cePNJ) {
        System.out.println(cePNJ.getRepliques().getPrisesArgent().get(contexte));
        joueur.transaction(cePNJ, montant);
        System.out.println("");
        
        // Définit le comportement qu'aura le PNJ au tour suivant
            // A ECRIRE !!!
    }

}
