package projet;

import java.io.*;
import java.util.*;

public class PNJ extends Personnage {

	private Comportement comportement;
	private Repliques repliques;

	public PNJ() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public PNJ(int identifiant, String nom, int age, int sexe, int argent,  Comportement comportement, Repliques repliques) {
            setIdentifiant(identifiant);
            setNom(nom);
            setAge(age);
            setSexe(sexe);
            setArgent(argent);
            setComportement(comportement);
            setRepliques(repliques);
      	}

	public void interagir() {
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
