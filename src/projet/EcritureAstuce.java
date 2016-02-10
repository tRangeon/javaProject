package projet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Classe qui permet d'écrire une " soluce " dans un fichier texte
 * @author Felix
 */
public class EcritureAstuce {
    private MaitreDuJeu maitreDuJeu;
    
    public EcritureAstuce(MaitreDuJeu maitreDuJeu) {
    this.maitreDuJeu = maitreDuJeu;
    }
    
    public void ecrire(){
        File f = new File ("Soluce");
        try
        {
            FileWriter fw = new FileWriter(f);
            fw.write("Ce qui peut vous faire gagner la partie:");
            String Newligne=System.getProperty("line.separator"); 
            fw.write (Newligne);            
            
            for(int i = 0; i < getMaitreDuJeu().getPieces().size(); i++){
                for(int j = 0; j < getMaitreDuJeu().getPieces().get(i).getPNJs().size(); j++){
                    if (maitreDuJeu.getPieces().get(i).getPNJs().get(j).getComportement().getClass().equals(new FinirLeJeuPNJ(maitreDuJeu, 1).getClass())){
                        if (egal((FinirLeJeuPNJ)maitreDuJeu.getPieces().get(i).getPNJs().get(j).getComportement(),new FinirLeJeuPNJ(maitreDuJeu, 1))){
                            fw.write("- "+getMaitreDuJeu().getPieces().get(i).getPNJs().get(j).getNom()+" (" + getMaitreDuJeu().getPieces().get(i).getNom()+")");
                            fw.write (Newligne);

                        }
                    }
                }
            }
            for(int i = 0; i < getMaitreDuJeu().getPieces().size(); i++){
                for(int j = 0; j < getMaitreDuJeu().getPieces().get(i).getObjets().size(); j++){
                    if (maitreDuJeu.getPieces().get(i).getObjets().get(j).getEffet().getClass().equals(new FinirLeJeuObjet(maitreDuJeu, 1).getClass())){
                        if (egal((FinirLeJeuObjet)maitreDuJeu.getPieces().get(i).getObjets().get(j).getEffet(),new FinirLeJeuObjet(maitreDuJeu, 1))){
                            fw.write("- "+getMaitreDuJeu().getPieces().get(i).getObjets().get(j).getNom()+" ("+ getMaitreDuJeu().getPieces().get(i).getNom()+")");
                            fw.write (Newligne);

                        }
                    }
                }
            }
            fw.write("Ce qui peut vous faire perdre la partie:");
            fw.write (Newligne);
            for(int i = 0; i < getMaitreDuJeu().getPieces().size(); i++){
                for(int j = 0; j < getMaitreDuJeu().getPieces().get(i).getPNJs().size(); j++){
                    if (maitreDuJeu.getPieces().get(i).getPNJs().get(j).getComportement().getClass().equals(new FinirLeJeuPNJ(maitreDuJeu, 1).getClass())){
                        if (egal((FinirLeJeuPNJ)maitreDuJeu.getPieces().get(i).getPNJs().get(j).getComportement(),new FinirLeJeuPNJ(maitreDuJeu, 0))){
                            fw.write("- "+getMaitreDuJeu().getPieces().get(i).getPNJs().get(j).getNom()+" ("+ getMaitreDuJeu().getPieces().get(i).getNom()+")");
                            fw.write (Newligne);

                        }
                    }
                }
            }
            
            for(int i = 0; i < getMaitreDuJeu().getPieces().size(); i++){
                for(int j = 0; j < getMaitreDuJeu().getPieces().get(i).getObjets().size(); j++){
                    if (maitreDuJeu.getPieces().get(i).getObjets().get(j).getEffet().getClass().equals(new FinirLeJeuObjet(maitreDuJeu, 1).getClass())){
                        if (egal((FinirLeJeuObjet)maitreDuJeu.getPieces().get(i).getObjets().get(j).getEffet(),new FinirLeJeuObjet(maitreDuJeu, 0))){
                            fw.write("- "+getMaitreDuJeu().getPieces().get(i).getObjets().get(j).getNom()+" ("+ getMaitreDuJeu().getPieces().get(i).getNom()+")");
                            fw.write (Newligne);

                        }
                    }
                }
            }            
            for(int i = 0; i < getMaitreDuJeu().getPieces().size(); i++){
                for(int j = 0; j < getMaitreDuJeu().getPieces().get(i).getObjets().size(); j++){
                    if (maitreDuJeu.getPieces().get(i).getObjets().get(j).getEffet().getClass().equals(new FinirLeJeuObjet(maitreDuJeu, 1).getClass())){
                        if (egal((FinirLeJeuObjet)maitreDuJeu.getPieces().get(i).getObjets().get(j).getEffet(),new FinirLeJeuObjet(maitreDuJeu, 1))){
                            fw.write(getMaitreDuJeu().getPieces().get(i).getObjets().get(j).getNom()+" peut vous faire gagner la partie");
                            fw.write (Newligne);

                        }
                    }
                }
            }
            fw.close();
        }
        catch (IOException exception)
        {
            System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
        }
    }    
    /**
     * 
     * @param finir1
     * @param finir2
     * @return 1 si les deux classes(FinirLeJeuPNJ) ont le meme attribut victoire
     */
    public boolean egal(FinirLeJeuPNJ finir1, FinirLeJeuPNJ finir2){
        if(finir1.getVictoire() == finir2.getVictoire()){
            return true;
        }else{
            return false;
        }
    }    
    /**
     * 
     * @param finir1
     * @param finir2
     * @return 1 si les deux classes(FinirLeJeObjet) ont le meme attribut victoire
     */
    public boolean egal(FinirLeJeuObjet finir1, FinirLeJeuObjet finir2){
        if(finir1.getVictoire() == finir2.getVictoire()){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * @return the maitreDuJeu
     */
    public MaitreDuJeu getMaitreDuJeu() {
        return maitreDuJeu;
    }

    /**
     * @param maitreDuJeu the maitreDuJeu to set
     */
    public void setMaitreDuJeu(MaitreDuJeu maitreDuJeu) {
        this.maitreDuJeu = maitreDuJeu;
    }
}
