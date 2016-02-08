package projet;

public class OuvrirPiece implements Effet {

	private Piece piece;

	/**
	 * Constructeur de l'effet OuvrirPiece
	 * @param piece La pièce à ouvrir
	 */
	public OuvrirPiece(Piece piece) {
		setPiece(piece);
	}

	public void interaction(Objet objet) {
		System.out.println(objet.getParametresObjet().getOuverturePiece());
		getPiece().setAcces(new Ouvert());
	}

	/**
	 * @return the piece
	 */
	public Piece getPiece() {
		return piece;
	}

	/**
	 * @param piece the piece to set
	 */
	public void setPiece(Piece piece) {
		this.piece = piece;
	}

}
