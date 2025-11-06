package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        String fil = mappe + filnavn;
        try {

            PrintWriter printWriter = new PrintWriter(fil);
            printWriter.println(samling.toString());
            printWriter.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("Fil ikke funnet");
            return false;
        }

    }
}
