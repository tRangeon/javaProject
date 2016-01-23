package projet;

import java.io.*;
import java.util.*;

public class Repliques {

	private ArrayList<String> invitations;
	private ArrayList<String> donsArgent;
	private ArrayList<String> prisesArgent;
	private ArrayList<String> discussions;
	private ArrayList<String> finDuJeu;

	public Repliques() {
            invitations = new ArrayList<>();
            donsArgent = new ArrayList<>();
            prisesArgent = new ArrayList<>();
            discussions = new ArrayList<>();
            finDuJeu = new ArrayList<>();
	}

    public void ajouterDiscussion(String discussion){
        this.discussions.add(discussion);
    }
    
    public void ajouterDonArgent(String donArgent){
        this.donsArgent.add(donArgent);
    }
    
    /**
     * @return the invitations
     */
    public ArrayList<String> getInvitations() {
        return invitations;
    }

    /**
     * @param invitations the invitations to set
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
     * @param donsArgent the donsArgent to set
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
     * @param prisesArgent the prisesArgent to set
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
     * @param discussions the discussions to set
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
     * @param finDuJeu the finDuJeu to set
     */
    public void setFinDuJeu(ArrayList<String> finDuJeu) {
        this.finDuJeu = finDuJeu;
    }

}
