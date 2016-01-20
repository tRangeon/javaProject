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
        Repliques repliquesFelix = new Repliques();
        repliquesFelix.ajouterDiscussion("Il fait beau aujourd'hui");
        repliquesFelix.ajouterDiscussion("J'aime beacoup ton t-shirt !");
        PNJ felix = new PNJ(0, "Felix", 21, 1, 1000, new Discuter(), repliquesFelix);
        
        felix.interagir();
        System.out.println(  );
        
    }
    
}
