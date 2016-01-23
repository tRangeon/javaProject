/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet;

/**
 *
 * @author isen
 */
public class Projet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Joueur joueur = new Joueur();
        joueur.setNom("Thibault");
        
        Repliques repliquesFelix = new Repliques();
        repliquesFelix.ajouterDiscussion("Il fait beau aujourd'hui");
        repliquesFelix.ajouterDiscussion("J'aime beacoup ton t-shirt !");
        repliquesFelix.ajouterDiscussion("T'en veux encore ?");
        repliquesFelix.ajouterDiscussion("T'aime ça hein !");
        repliquesFelix.ajouterDonArgent("Tiens tu m'as l'air sympa, prend ce petit cadeau !");
        repliquesFelix.ajouterDonArgent("Merci pour la dernière fois, tiens je te rends ton argent");
        
        PNJ felix = new PNJ(0, "Felix", 21, 1, 1000, new Discuter(), repliquesFelix);
             
        //felix.interagir();
        felix.setComportement(new DonnerArgent(joueur, 100, 1));
        felix.interagir();
        
    }
    
}
