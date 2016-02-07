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
        System.out.println("---------- Debut du jeu --------\n");

        MaitreDuJeu maitreDuJeu = new MaitreDuJeu();
        Joueur joueur = new Joueur("Thomas");

        PNJ felix = new PNJ("Felix", joueur, maitreDuJeu);
        /*PNJ matthieu = new PNJ("Matthieu", joueur, maitreDuJeu);
         matthieu.getRepliques().ajouterReplique(4, "Hello " + joueur.getNom() + ", tu est rayonnant aujourd'hui");
         matthieu.getRepliques().ajouterReplique(4, "Quoi ?? Tu n'as que " + joueur.getAge() + " ans ? Tu en fais au moins " + (joueur.getAge()+10) + " !");
         */

        felix.modifierComportement(3, 100, 0);
        felix.interagir();
        felix.interagir();
        felix.interagir();

    }

}
