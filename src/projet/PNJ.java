package projet;

/**
 * Classe PNJ (Personnage Non Joueur)
 * @author isen
 */
public class PNJ extends Personnage {

	private Comportement comportement;
	private Repliques repliques;

        /**
         * Constructeur par défaut pour la classe PNJ, il faut juste renseigner le nom du personnage
         * @param nom 
         */
	public PNJ(String nom) {
            setIdentifiant(1);
            setNom(nom);
            setAge(25);
            setSexe(1);
            setArgent(200);
            setComportement(new Discuter());
            setRepliques(new Repliques(true));
	}
        
        /**
         * Constructeur de la classe PNJ, il faut renseigner tous les attributs du personnage
         * @param identifiant
         * @param nom
         * @param age
         * @param sexe
         * @param argent
         * @param comportement
         * @param repliques 
         */
	public PNJ(int identifiant, String nom, int age, int sexe, int argent,  Comportement comportement, Repliques repliques) {
            setIdentifiant(identifiant);
            setNom(nom);
            setAge(age);
            setSexe(sexe);
            setArgent(argent);
            setComportement(comportement);
            setRepliques(repliques);
      	}

        /**
         * Methode interagir qui est la base de toutes les ations possibles avec un PNJ
         * Selon le comportement du PNJ, les actions seront différentes
         */
	public void interagir() {
            System.out.print(getNom() + ": ");
            this.comportement.interaction(this);
	}

    /**
     * @return the comportement
     */
    public Comportement getComportement() {
        return comportement;
    }

    /**
     * @param comportement the comportement to set
     */
    public void setComportement(Comportement comportement) {
        this.comportement = comportement;
    }

    /**
     * @return the repliques
     */
    public Repliques getRepliques() {
        return repliques;
    }

    /**
     * @param repliques the repliques to set
     */
    public void setRepliques(Repliques repliques) {
        this.repliques = repliques;
    }

}
