/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.*;

/**
 *
 * @author isen
 */
public class Projet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---------- Debut du jeu --------\n");

        MaitreDuJeu maitreDuJeu = new MaitreDuJeu();
        Joueur joueur = new Joueur("Thomas");
        maitreDuJeu.setJoueur(joueur);
        
        Piece p1 = new Piece(1, "Acceuil");
        Piece p2 = new Piece(2, "Maison Isen");
                
        PNJ mathieu = new PNJ("Mathieu", joueur, maitreDuJeu);
        PNJ helene = new PNJ("Helene", joueur, maitreDuJeu);
        PNJ gaetan = new PNJ("Gaetan", joueur, maitreDuJeu);
                     
        p1.ajouterPNJ(mathieu);
        p2.ajouterPNJ(helene);
        p2.ajouterPNJ(gaetan);
        
        joueur.setPosition(p1);
                
        ArrayList<Piece> pieces = new ArrayList();
        pieces.add(p1);
        pieces.add(p2);
        maitreDuJeu.setPieces(pieces);    
       
        mathieu.setComportement(new Inviter(maitreDuJeu, joueur, 2));
        

        while( (maitreDuJeu.getVictoire() != 0) && (maitreDuJeu.getVictoire() != 1) ){
            maitreDuJeu.jouerUnTour();
            
        }
        maitreDuJeu.jouerUnTour();
        
       
        /*PNJ matthieu = new PNJ("Matthieu", joueur, maitreDuJeu);
         matthieu.getRepliques().ajouterReplique(4, "Hello " + joueur.getNom() + ", tu est rayonnant aujourd'hui");
         matthieu.getRepliques().ajouterReplique(4, "Quoi ?? Tu n'as que " + joueur.getAge() + " ans ? Tu en fais au moins " + (joueur.getAge()+10) + " !");
         */
        /*
        PNJ felix = new PNJ("Felix", joueur, maitreDuJeu);
        felix.modifierComportement(3, 100, 0);
        felix.interagir();
        felix.interagir();
        felix.interagir();
                */

    }

}
