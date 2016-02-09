package projet;

import java.util.*;

/**
 * Classe dans laquelle on écrit le scénario
 * @author isen
 *
 */
public class Scenario {
	
	/**
	 * Constructeur du Scénario, dans lequel on initalise toutes les instances du jeu
	 */
	public Scenario(Joueur joueur, MaitreDuJeu maitreDuJeu){
		
		// Creation des pieces
        Piece p1 = new Piece(1, "Accueil");
        Piece p2 = new Piece(2, "Atrium");
        Piece p3 = new Piece(3, "Bar ISEN");
        Piece p4 = new Piece(4, "Salle de cours");
        Piece p5 = new Piece(5, "Local technique");
        Piece p6 = new Piece(6, "Pièce secrète");
        
        p3.setAcces(new Verouille());
        p6.setAcces(new Payant(25, joueur));
        
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
        
        p6.getPiecesVoisines().add(p1);
        
        // On ajoute les pieces au maitre du jeu
        ArrayList<Piece> pieces = new ArrayList<Piece>();
        pieces.add(p1);
        pieces.add(p2);
        pieces.add(p3);
        pieces.add(p4);
        pieces.add(p5);
        pieces.add(p6);
        maitreDuJeu.setPieces(pieces);    
        
        // Creation des PNJ
        PNJ mathieu = new PNJ(1, "Mathieu", 20, 1, 500, new Inviter(maitreDuJeu, joueur, 3), new Repliques(true), joueur, maitreDuJeu);
        mathieu.getRepliques().getInvitations().remove(0);
        mathieu.getRepliques().ajouterReplique(1, "Hé " + joueur.getNom() + " viens prendre une mousse au Bar ISEN !");
      
        PNJ mathilde = new PNJ(2, "Mathilde", 19, 2, 3000, new Inviter(maitreDuJeu, joueur, 2), new Repliques(true), joueur, maitreDuJeu);
        mathilde.getRepliques().getInvitations().remove(0);
        mathilde.getRepliques().ajouterReplique(1, "Je suis complètement perdue, conduis moi jusqu'à l'Atrium !");
        
        PNJ agathe = new PNJ(3, "Agathe", 18, 2, 200, new PrendreArgent(joueur, 10, 1), new Repliques(false), joueur, maitreDuJeu);
        agathe.getRepliques().ajouterReplique(4, "Je m'ennuie ...");
        agathe.getRepliques().ajouterReplique(4, "J'ai faim !");
        agathe.getRepliques().ajouterReplique(2, "Tiens beau gosse, voilà une pièce pour toi");
        agathe.getRepliques().ajouterReplique(3, "Tu me dois de l'argent pour le cours particulier d'hier soir ...");
        agathe.getRepliques().ajouterReplique(3, "Tu aurais un peu de monaie ? Reviens me voir tout à l'heure pour que je te rembourse");
        agathe.getRepliques().ajouterReplique(2, "T'es un amour de m'avoir prêté de l'argent, tiens voilà ce que je te dois !");
        
        PNJ habib = new PNJ(4, "Habib", 30, 1, 1500, new Discuter(joueur), new Repliques(true), joueur, maitreDuJeu);
        habib.getRepliques().getDiscussions().clear();;
        habib.getRepliques().ajouterReplique(4, joueur.getNom() + ", trouve toi une cavalière pour le Gala !");
        
        PNJ helene = new PNJ(5,"Helene", 18, 2, 500, new FinirLeJeuPNJ(maitreDuJeu, 1), new Repliques(true), joueur, maitreDuJeu);
        helene.getRepliques().ajouterReplique(5, "Mon prince charmant, je t'ai enfin trouvé ! Emmène moi au bal !");
        
        PNJ gaetan = new PNJ(6, "Gaetan", 25, 1, 1000, new PrendreArgent(joueur, joueur.getArgent(), 0), new Repliques(true), joueur, maitreDuJeu);
        
        PNJ felix = new PNJ(7, "Félix", 21, 1, 1000, new DonnerArgent(joueur, 50, 0), new Repliques(true), joueur, maitreDuJeu);
        
        PNJ martin = new PNJ(8, "Martin", 19, 1, 1000, new Discuter(joueur), new Repliques(true), joueur, maitreDuJeu);
        martin.getRepliques().getDiscussions().clear();
        martin.getRepliques().ajouterReplique(4, "Hello " + joueur.getNom() + ", je suis Martin le coquin !");
        
        PNJ camille = new PNJ(9, "Camille", 21, 2, 3000, new Discuter(joueur), new Repliques(true), joueur, maitreDuJeu);
        camille.getRepliques().getDiscussions().clear();
        camille.getRepliques().ajouterReplique(4, "Ca aurait été avec plaisir " + joueur.getNom() + ", mais j'ai déjà un cavalier pour le gala");
        
        PNJ seraphin = new PNJ(10, "Séraphin", 18, 1, 200, new Inviter(maitreDuJeu, joueur, 4), new Repliques(true), joueur, maitreDuJeu);
         
        PNJ thomas = new PNJ(11, "Thomas", 21, 1, 3000, new Inviter(maitreDuJeu, joueur, 6), new Repliques(true), joueur, maitreDuJeu);
        thomas.getRepliques().getInvitations().clear();
        thomas.getRepliques().getInvitations().add("Yo, pour 50 balles je t'emmène dans la caverne d'Ali Baba mon pote ! Tu payes la moitié maintenant et le reste sur place");
       
        // Repartition des PNJ dans les pièces
        p1.ajouterPNJ(habib);
        p1.ajouterPNJ(mathilde);
        
        p2.ajouterPNJ(mathieu);
        p2.ajouterPNJ(agathe);
        p2.ajouterPNJ(seraphin);
        
        p3.ajouterPNJ(martin);
        p3.ajouterPNJ(camille);
        p3.ajouterPNJ(helene);
        
        p4.ajouterPNJ(gaetan);
        
        p5.ajouterPNJ(felix);
        p5.ajouterPNJ(thomas);
        
        // Creation des objets
        Objet pomme = new Objet(100, "Pomme", new FinirLeJeuObjet(maitreDuJeu, 0), new ParametresObjet());
        pomme.getParametresObjet().setFinDuJeu(joueur.getNom() + " mange la pomme, mais elle était empoisonnée !");
        
        Objet biere = new Objet(101, "Bière", new AfficherTexte(), new ParametresObjet());
        biere.getParametresObjet().setAffichageTexte(joueur.getNom() + " boit la bière ... cul sec !");
        
        Objet badge = new Objet(102, "Badge", new OuvrirPiece(p3), new ParametresObjet());
        badge.getParametresObjet().setOuverturePiece("Ce badge dévérouille les portes du Bar ISEN");
        
        Objet sujet = new Objet(103, "Sujet du partiel de Java", new AfficherTexte(), new ParametresObjet());
        sujet.getParametresObjet().setAffichageTexte(joueur.getNom() + " lit le sujet du partiel de Java de la semaine prochaine !");
        
        Objet herbe = new Objet(104, "Herbe", new AfficherTexte(), new ParametresObjet());
        herbe.getParametresObjet().setAffichageTexte("Ce n'est ni plus ni moins qu'un morceau de gazon ...");
        
        Objet whisky = new Objet(105, "Whisky", new AfficherTexte(), new ParametresObjet());
        whisky.getParametresObjet().setAffichageTexte("C'est un " + (joueur.getAge()+10) + " ans d'âge, soit 10 ans plus vieux que " + joueur.getNom());
        
        // Repartition des objets dans les pieces
        p1.ajouterObjet(pomme);
        
        p3.ajouterObjet(biere);
        
        p5.ajouterObjet(badge);
        
        p6.ajouterObjet(whisky);
        p6.ajouterObjet(herbe);
        p6.ajouterObjet(sujet);
        
        // Emplacement de depart du joueur    
        joueur.setPosition(p1);
	}
	
}

