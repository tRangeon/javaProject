package projet;

public class PrendreArgent implements Comportement {

    private Joueur joueur;
    private int montant;
    private int contexte;

    /**
     * Constructeur du comoportement PrendreArgent.
     * Le PNJ prendra de l'argent au joueur, selon le contexte il peut:
     * - voler l'argent du joueur (contexte = 0)
     * - emprunter de l'argent au joueur (contexte = 1)
     * @param joueur
     * @param montant
     * @param contexte 0 = voler argent; 1 = emprunter argent
     */
    public PrendreArgent(Joueur joueur, int montant, int contexte) {
        this.montant = montant;
        this.contexte = contexte;
        this.joueur = joueur;
    }

    /**
     * Methode qui met en oeuvre le comportement PrendreArgent
     * @param cePNJ Le PNJ qui va prendre l'argent
     */
    public void interaction(PNJ cePNJ) {
        System.out.println(cePNJ.getRepliques().getPrisesArgent().get(contexte));
        joueur.transaction(cePNJ, montant);
        joueur.afficherArgent();
        
        // Définit le comportement qu'aura le PNJ au tour suivant
            // A ECRIRE !!!
            // Y compris quand on vole le portefeuille, il faut mettre à jour l'argent du joueur !
    }

}
