package projet;

import java.io.*;
import java.util.*;

public class Discuter implements Comportement {

    public Discuter() {

    }

    public void interaction(PNJ cePNJ) {
        int nombreAleatoire1 = (int) (Math.random() * 10) % 2;
        System.out.println(cePNJ.getRepliques().getDiscussions().get(nombreAleatoire1));

    }
}
