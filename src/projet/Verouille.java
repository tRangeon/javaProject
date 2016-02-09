package projet;

/**
 * Accès pièce: Verouillé
 * 
 * @author Thomas
 *
 */
public class Verouille implements Acces {

	public Verouille() {
	}

	public boolean accession(Piece piece) {
		return false;
	}

}
