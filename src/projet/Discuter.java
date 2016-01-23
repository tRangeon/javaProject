package projet;

import java.io.*;
import java.util.*;

public class Discuter implements Comportement {

    public Discuter() {
    }

    public void interaction(PNJ cePNJ) {
        int nbreDiscussions = cePNJ.getRepliques().getDiscussions().size();
        int nombreAleatoire1 = (int) (Math.random() * 100) % nbreDiscussions;
        System.out.println(cePNJ.getRepliques().getDiscussions().get(nombreAleatoire1));

    }
}
