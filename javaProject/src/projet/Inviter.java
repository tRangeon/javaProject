package projet;

public class Inviter implements Comportement {

    private MaitreDuJeu maitreDuJeu;
    private Joueur joueur;
    private Piece pieceDestination;

    public Inviter(MaitreDuJeu maitreDuJeu, Joueur joueur, int numeroPieceDestination) {
        setMaitreDuJeu(maitreDuJeu);
        setJoueur(joueur);

        int index;
        for (index = 0; index < maitreDuJeu.getPieces().size(); index++) {
            if (maitreDuJeu.getPieces().get(index).getNumero() == numeroPieceDestination) {
                pieceDestination = maitreDuJeu.getPieces().get(index);
            } else {
                // Si le numero de la piece ne correspond a aucune piece existante, par defaut le joueur reste  a sa place 
                pieceDestination = joueur.getPosition();
            }

        }

    }

    public void interaction(PNJ cePNJ) {
        System.out.println(cePNJ.getRepliques().getInvitations().get(0));
        maitreDuJeu.deplacerJoueur(joueur, pieceDestination);
        maitreDuJeu.deplacerPNJ(cePNJ, pieceDestination);
        
        // Faire le changement de comportement ici
    }

    /**
     * @return the maitreDuJeu
     */
    public MaitreDuJeu getMaitreDuJeu() {
        return maitreDuJeu;
    }

    /**
     * @param maitreDuJeu the maitreDuJeu to set
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
     * @param joueur the joueur to set
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
     * @param pieceDestination the pieceDestination to set
     */
    public void setPieceDestination(Piece pieceDestination) {
        this.pieceDestination = pieceDestination;
    }

}
