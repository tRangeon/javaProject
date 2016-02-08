package projet;

/**
 * Classe PNJ (Personnage Non Joueur)
 *
 * @author isen
 */
public class PNJ extends Personnage {

    private Comportement comportement;
    private Repliques repliques;
    private Joueur joueur;
    private MaitreDuJeu maitreDuJeu;

    /**
     * Constructeur par défaut pour la classe PNJ, il faut juste renseigner le
     * nom du personnage
     *
     * @param nom
     * @param joueur 
     * @param maitreDuJeu 
     */
    public PNJ(String nom, Joueur joueur, MaitreDuJeu maitreDuJeu) {
        setIdentifiant(1);
        setNom(nom);
        setAge(25);
        setSexe(1);
        setArgent(200);
        setComportement(new Discuter(joueur));
        setRepliques(new Repliques(true));
        setJoueur(joueur);
        setMaitreDuJeu(maitreDuJeu);
    }

    /**
     * Constructeur de la classe PNJ, il faut renseigner tous les attributs du
     * personnage
     *
     * @param identifiant
     * @param nom
     * @param age
     * @param sexe
     * @param argent
     * @param comportement
     * @param repliques
     * @param joueur 
     * @param maitreDuJeu 
     * @param numeroPiece 
     */
    public PNJ(int identifiant, String nom, int age, int sexe, int argent, Comportement comportement, Repliques repliques, Joueur joueur, MaitreDuJeu maitreDuJeu) {
        setIdentifiant(identifiant);
        setNom(nom);
        setAge(age);
        setSexe(sexe);
        setArgent(argent);
        setComportement(comportement);
        setRepliques(repliques);
        setJoueur(joueur);
        setMaitreDuJeu(maitreDuJeu);
    }

    /**
     * Methode interagir qui est la base de toutes les ations possibles avec un
     * PNJ Selon le comportement du PNJ, les actions seront différentes
     */
    public void interagir() {
        System.out.print(getNom() + ": ");
        this.comportement.interaction(this);
    }

    /**
     *
     * @param choixComportement 0 pour Inviter,1 pour DonnerArgent,2 pour
     * PrendreArgent,3 pour Discuter et 4 pour FinirLeJeuPNJ
     * @param parametre1
     * @param parametre2
     */
    public void modifierComportement(int choixComportement, int parametre1, int parametre2) {
        switch (choixComportement) {
            case 0:
                this.setComportement(new Inviter(getMaitreDuJeu(), getJoueur(), parametre1));
                break;
            case 1:
                this.setComportement(new DonnerArgent(getJoueur(), parametre1, parametre2));
                break;
            case 2:
                this.setComportement(new PrendreArgent(getJoueur(), parametre1, parametre2));
                break;
            case 3:
                this.setComportement(new Discuter(getJoueur()));
                break;
            case 4:
                this.setComportement(new FinirLeJeuPNJ(getMaitreDuJeu(), parametre1));
                break;
        }
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
}
