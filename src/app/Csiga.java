package app;

import java.util.Random;

public class Csiga {
    private final Szin szin;
    private int osszTav;
    private String utVonal;
    private final Random rnd = new Random();

    public Csiga(Szin szin) {
        this.szin = szin;
        this.osszTav = 0;
        this.utVonal = "";
    }

    public void megy() {

        int lepes = rnd.nextInt(4);
        

        if (rnd.nextInt(5) == 0) { 

            utVonal += "==";
            lepes *= 2; 
        } else {

            for (int i = 0; i < lepes; i++) {
                utVonal += "-";
            }
        }
        this.osszTav += lepes; 
    }

    public void rajzol() {

        System.out.println(szin.getAnsiKod() + utVonal + "🐌" + Szin.RESET);
    }

    public int getTav() { return osszTav; }
    public Szin getSzin() { return szin; }
}