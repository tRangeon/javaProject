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
        System.out.println("---------- Debut du jeu --------");
        
        // Creation du Maitre du jeu et du joueur
        MaitreDuJeu maitreDuJeu = new MaitreDuJeu();
        Joueur joueur = new Joueur("Thomas");
        maitreDuJeu.setJoueur(joueur);
        
        // Creation des pieces
        Piece p1 = new Piece(1, "Accueil");
        Piece p2 = new Piece(4, "Atrium");
        Piece p3 = new Piece(3, "Bar ISEN");
        
        ArrayList<Piece> pieces = new ArrayList();
        pieces.add(p1);
        pieces.add(p2);
        pieces.add(p3);
        maitreDuJeu.setPieces(pieces);    
        
        // Creation des PNJ
        PNJ mathieu = new PNJ(1, "Mathieu", 20, 1, 500, new Inviter(maitreDuJeu, joueur, 3), new Repliques(false), joueur, maitreDuJeu);
        mathieu.getRepliques().ajouterReplique(1, "Hé " + joueur.getNom() + " viens prendre une mousse au Bar ISEN !");
        
        PNJ mathilde = new PNJ(7, "Mathilde", 19, 2, 3000, new Inviter(maitreDuJeu, joueur, 4), new Repliques(false), joueur, maitreDuJeu);
        mathilde.getRepliques().ajouterReplique(1, "Si tu cherches une cavalière, va voir dans l'atrium, viens je t'emmène si tu veux");
        
        PNJ agathe = new PNJ(8, "Agathe", 40, 2, 200, new Discuter(joueur), new Repliques(false), joueur, maitreDuJeu);
        agathe.getRepliques().ajouterReplique(4, "Mais enfin " + joueur.getNom() + ", j'ai " + agathe.getAge() + " ans, et toi " + joueur.getAge() + "... Je ne peux pas être ta cavalière !");
        
        PNJ habib = new PNJ(6, "Habib", 30, 1, 1500, new Discuter(joueur), new Repliques(false), joueur, maitreDuJeu);
        habib.getRepliques().ajouterReplique(4, joueur.getNom() + ", trouve toi une cavalière pour le Gala !");
        
        PNJ helene = new PNJ(5,"Helene", 18, 2, 500, new FinirLeJeuPNJ(maitreDuJeu, 1), new Repliques(true), joueur, maitreDuJeu);
        helene.getRepliques().ajouterReplique(5, "Mon prince charmant, je t'ai enfin trouvé ! Emmène moi au bal !");
        
        PNJ gaetan = new PNJ(2, "Gaetan", 25, 1, 1000, new PrendreArgent(joueur, 100, 0), new Repliques(true), joueur, maitreDuJeu);
        PNJ felix = new PNJ(3, "Félix", 21, 1, 1000, new DonnerArgent(joueur, 50, 0), new Repliques(true), joueur, maitreDuJeu);
        PNJ martin = new PNJ(4, "Martin", 19, 1, 1000, new Discuter(joueur), new Repliques(false), joueur, maitreDuJeu);
        martin.getRepliques().ajouterReplique(4, "Hello " + joueur.getNom() + ", je suis Martin le coquin !");
          
        // Repartition des PNJ dans les pièces
        p1.ajouterPNJ(habib);
        p1.ajouterPNJ(mathilde);
        p2.ajouterPNJ(mathieu);
        p2.ajouterPNJ(agathe);
        p3.ajouterPNJ(helene);
        p3.ajouterPNJ(martin);
        p3.ajouterPNJ(gaetan);
        p3.ajouterPNJ(felix);
        
                
        joueur.setPosition(p1);

        while( (maitreDuJeu.getVictoire() != 0) && (maitreDuJeu.getVictoire() != 1) ){
            maitreDuJeu.jouerUnTour();   
        }
        maitreDuJeu.jouerUnTour();

    }

}
