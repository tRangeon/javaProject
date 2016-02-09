package projet;

import java.util.*;

/**
 * Classe repliques, qui contient les toutes les repliques qu'un PNJ peut avoir
 * pour chaque comportement possible
 * 
 * @author Thomas
 */
public class Repliques {

	private ArrayList<String> invitations;
	private ArrayList<String> donsArgent;
	private ArrayList<String> prisesArgent;
	private ArrayList<String> discussions;
	private ArrayList<String> finDuJeu;

	/**
	 * Constructeur de Repliques
	 * 
	 * @param parDefaut
	 *            Si "true" des repliques par défaut sont insérées, sinon les
	 *            champs sont laissés vides
	 */
	public Repliques(boolean parDefaut) {
		invitations = new ArrayList<>();
		donsArgent = new ArrayList<>();
		prisesArgent = new ArrayList<>();
		discussions = new ArrayList<>();
		finDuJeu = new ArrayList<>();

		if (parDefaut == true) {
			invitations.add("Viens, suis moi !");
			donsArgent.add("Tiens, prends ce cadeau");
			donsArgent.add("Merci pour ton aide, voilà ton argent");
			prisesArgent.add("Hé toi, donne moi ton portefeuille");
			prisesArgent.add("Dis, t'aurais pas un peu d'argent à m'avancer ?");
			discussions.add("Quelle belle journée ...");
			discussions.add("C'est fou comme on s'amuse ici !");
			discussions.add("Tu m'as l'air fatigué non ?");
			discussions.add("Salut toi, ça va ?");
			finDuJeu.add("Félicitations, tu as gagné !");
		}
	}

	/**
	 * Methode qui permet d'ajouter une réplique
	 * 
	 * @param typeDeReplique
	 *            1 = invitation; 2 = donArgent; 3 = priseArgent; 4 =
	 *            discussion; 5 = finDujeu
	 * @param replique
	 */
	public void ajouterReplique(int typeDeReplique, String replique) {
		switch (typeDeReplique) {
		case 1:
			invitations.add(replique);
			break;
		case 2:
			donsArgent.add(replique);
			break;
		case 3:
			prisesArgent.add(replique);
			break;
		case 4:
			discussions.add(replique);
			break;
		case 5:
			finDuJeu.add(replique);
			break;
		}
	}

	/**
	 * @return the invitations
	 */
	public ArrayList<String> getInvitations() {
		return invitations;
	}

	/**
	 * @param invitations
	 *            the invitations to set
	 */
	public void setInvitations(ArrayList<String> invitations) {
		this.invitations = invitations;
	}

	/**
	 * @return the donsArgent
	 */
	public ArrayList<String> getDonsArgent() {
		return donsArgent;
	}

	/**
	 * @param donsArgent
	 *            the donsArgent to set
	 */
	public void setDonsArgent(ArrayList<String> donsArgent) {
		this.donsArgent = donsArgent;
	}

	/**
	 * @return the prisesArgent
	 */
	public ArrayList<String> getPrisesArgent() {
		return prisesArgent;
	}

	/**
	 * @param prisesArgent
	 *            the prisesArgent to set
	 */
	public void setPrisesArgent(ArrayList<String> prisesArgent) {
		this.prisesArgent = prisesArgent;
	}

	/**
	 * @return the discussions
	 */
	public ArrayList<String> getDiscussions() {
		return discussions;
	}

	/**
	 * @param discussions
	 *            the discussions to set
	 */
	public void setDiscussions(ArrayList<String> discussions) {
		this.discussions = discussions;
	}

	/**
	 * @return the finDuJeu
	 */
	public ArrayList<String> getFinDuJeu() {
		return finDuJeu;
	}

	/**
	 * @param finDuJeu
	 *            the finDuJeu to set
	 */
	public void setFinDuJeu(ArrayList<String> finDuJeu) {
		this.finDuJeu = finDuJeu;
	}

}
