package projet;

public class FinirLeJeuPNJ implements Comportement {

    private MaitreDuJeu maitreDuJeu;
    private int victoire;

    public FinirLeJeuPNJ(MaitreDuJeu maitreDuJeu, int victoire) {
        setMaitreDuJeu(maitreDuJeu);
        setVictoire(victoire);
    }

    public void interaction(PNJ cePNJ) {
        System.out.println(cePNJ.getRepliques().getFinDuJeu().get(victoire));
        maitreDuJeu.setVictoire(victoire);
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
     * @return the victoire
     */
    public int getVictoire() {
        return victoire;
    }

    /**
     * @param victoire the victoire to set
     */
    public void setVictoire(int victoire) {
        this.victoire = victoire;
    }

}
