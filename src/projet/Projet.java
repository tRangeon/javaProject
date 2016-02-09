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
        Joueur joueur = maitreDuJeu.CreerJoueur();
        maitreDuJeu.setJoueur(joueur);
        
        // Creation des pieces
        Piece p1 = new Piece(1, "Accueil");
        Piece p2 = new Piece(2, "Atrium");
        Piece p3 = new Piece(3, "Bar ISEN");
        Piece p4 = new Piece(4, "Salle de cours");
        Piece p5 = new Piece(5, "Local technique");
        
        p3.setAcces(new Verouille());
        
        // Pieces voisines
        p1.getPiecesVoisines().add(p2);
        p1.getPiecesVoisines().add(p3);
        
        p2.getPiecesVoisines().add(p1);
        p2.getPiecesVoisines().add(p3);
        
        p3.getPiecesVoisines().add(p1);
        p3.getPiecesVoisines().add(p2);
        
        p4.getPiecesVoisines().add(p5);
        
        p5.getPiecesVoisines().add(p4);
        p5.getPiecesVoisines().add(p1);
        
        
        ArrayList<Piece> pieces = new ArrayList();
        pieces.add(p1);
        pieces.add(p2);
        pieces.add(p3);
        pieces.add(p4);
        pieces.add(p5);
        maitreDuJeu.setPieces(pieces);    
        
        // Creation des PNJ
        PNJ mathieu = new PNJ(1, "Mathieu", 20, 1, 500, new Inviter(maitreDuJeu, joueur, 3), new Repliques(true), joueur, maitreDuJeu);
        mathieu.getRepliques().getInvitations().remove(0);
        mathieu.getRepliques().ajouterReplique(1, "Hé " + joueur.getNom() + " viens prendre une mousse au Bar ISEN !");
      
        PNJ mathilde = new PNJ(7, "Mathilde", 19, 2, 3000, new Inviter(maitreDuJeu, joueur, 2), new Repliques(true), joueur, maitreDuJeu);
        mathilde.getRepliques().getInvitations().remove(0);
        mathilde.getRepliques().ajouterReplique(1, "Je suis complètement perdue, conduis moi jusqu'à l'Atrium !");
        
        PNJ agathe = new PNJ(8, "Agathe", 18, 2, 200, new PrendreArgent(joueur, 10, 1), new Repliques(false), joueur, maitreDuJeu);
        agathe.getRepliques().ajouterReplique(4, "Je m'ennuie ...");
        agathe.getRepliques().ajouterReplique(4, "J'ai faim !");
        agathe.getRepliques().ajouterReplique(2, "Tiens beau gosse, voilà une pièce pour toi");
        agathe.getRepliques().ajouterReplique(3, "Tu me dois de l'argent pour le cours particulier d'hier soir ...");
        agathe.getRepliques().ajouterReplique(3, "Tu aurais un peu de monaie ? Reviens me voir tout à l'heure pour que je te rembourse");
        agathe.getRepliques().ajouterReplique(2, "T'es un amour de m'avoir prêté de l'argent, tiens voilà ce que je te dois !");
        
        PNJ habib = new PNJ(6, "Habib", 30, 1, 1500, new Discuter(joueur), new Repliques(true), joueur, maitreDuJeu);
        habib.getRepliques().getDiscussions().clear();;
        habib.getRepliques().ajouterReplique(4, joueur.getNom() + ", trouve toi une cavalière pour le Gala !");
        
        PNJ helene = new PNJ(5,"Helene", 18, 2, 500, new FinirLeJeuPNJ(maitreDuJeu, 1), new Repliques(true), joueur, maitreDuJeu);
        helene.getRepliques().ajouterReplique(5, "Mon prince charmant, je t'ai enfin trouvé ! Emmène moi au bal !");
        
        PNJ gaetan = new PNJ(2, "Gaetan", 25, 1, 1000, new PrendreArgent(joueur, joueur.getArgent(), 0), new Repliques(true), joueur, maitreDuJeu);
        
        PNJ felix = new PNJ(3, "Félix", 21, 1, 1000, new DonnerArgent(joueur, 50, 0), new Repliques(true), joueur, maitreDuJeu);
        
        PNJ martin = new PNJ(4, "Martin", 19, 1, 1000, new Discuter(joueur), new Repliques(true), joueur, maitreDuJeu);
        martin.getRepliques().getDiscussions().clear();
        martin.getRepliques().ajouterReplique(4, "Hello " + joueur.getNom() + ", je suis Martin le coquin !");
        
        PNJ camille = new PNJ(10, "Camille", 21, 2, 3000, new Discuter(joueur), new Repliques(true), joueur, maitreDuJeu);
        camille.getRepliques().getDiscussions().clear();
        camille.getRepliques().ajouterReplique(4, "Ca aurait été avec plaisir " + joueur.getNom() + ", mais j'ai déjà un cavalier pour le gala");
        
        PNJ seraphin = new PNJ(9, "Séraphin", 18, 1, 200, new Inviter(maitreDuJeu, joueur, 4), new Repliques(true), joueur, maitreDuJeu);
          
        // Repartition des PNJ dans les pièces
        p1.ajouterPNJ(habib);
        p1.ajouterPNJ(mathilde);
        p2.ajouterPNJ(mathieu);
        p2.ajouterPNJ(agathe);
        p3.ajouterPNJ(helene);
        p3.ajouterPNJ(martin);
        p3.ajouterPNJ(camille);
        p4.ajouterPNJ(gaetan);
        p5.ajouterPNJ(felix);
        p2.ajouterPNJ(seraphin);
        
        // Creation des objets
        Objet pomme = new Objet(100, "Pomme", new FinirLeJeuObjet(maitreDuJeu, 0), new ParametresObjet());
        pomme.getParametresObjet().setFinDuJeu(joueur.getNom() + " mange la pomme, mais elle était empoisonnée !");
        
        Objet biere = new Objet(101, "Bière", new AfficherTexte(), new ParametresObjet());
        biere.getParametresObjet().setAffichageTexte(joueur.getNom() + " boit la bière ... cul sec !");
        
        Objet badge = new Objet(102, "Badge", new OuvrirPiece(p3), new ParametresObjet());
        badge.getParametresObjet().setOuverturePiece("Ce badge dévérouille les portes du Bar ISEN");
        
        // Repartition des objets dans les pieces
        p1.ajouterObjet(pomme);
        p3.ajouterObjet(biere);
        p5.ajouterObjet(badge);
        
        // Emplacement de depart du joueur    
        joueur.setPosition(p1);

        while( (maitreDuJeu.getVictoire() != 0) && (maitreDuJeu.getVictoire() != 1) ){
            maitreDuJeu.jouerUnTour();   
        }
        maitreDuJeu.jouerUnTour();

    }

}
