package projet;

public class FinirLeJeuObjet implements Effet {

	private MaitreDuJeu maitreDuJeu;
	private int victoire;

	/**
	 * Constructeur de l'effet FinirLeJeu pour un objet
	 * @param maitreDuJeu
	 * @param victoire 0 = perdu; 1 = gagné
	 */
	public FinirLeJeuObjet(MaitreDuJeu maitreDuJeu, int victoire) {
		setMaitreDuJeu(maitreDuJeu);
		setVictoire(victoire);
	}

	/**
	 * Methode qui met permet de mettre en oeuvre l'effet FinirLeJeuObjet
	 * @param objet
	 */
	public void interaction(Objet objet) {
		System.out.println(objet.getParametresObjet().getFinDuJeu());
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
	public int isVictoire() {
		return victoire;
	}

	/**
	 * @param victoire the victoire to set
	 */
	public void setVictoire(int victoire) {
		this.victoire = victoire;
	}

}
