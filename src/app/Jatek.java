package app;

import java.util.Scanner;

public class Jatek {
    private Csiga cs1, cs2, cs3;
    private Szin tipp;

    public void start() {
        cs1 = new Csiga(Szin.PIROS);
        cs2 = new Csiga(Szin.ZÖLD);
        cs3 = new Csiga(Szin.KÉK);

        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik csigára fogadsz (P - piros, Z - zöld, K - kék): ");
        String bemenet = sc.nextLine().toUpperCase();
        

        if (bemenet.contains("P")) tipp = Szin.PIROS;
        else if (bemenet.contains("Z")) tipp = Szin.ZÖLD;
        else if (bemenet.contains("K")) tipp = Szin.KÉK;
        else tipp = Szin.PIROS;


        for (int kor = 1; kor <= 5; kor++) {
            cs1.megy();
            cs2.megy();
            cs3.megy();
        }

        System.out.println("\n--- VERSENY EREDMÉNYE ---");
        cs1.rajzol();
        cs2.rajzol();
        cs3.rajzol();

        kihirdetGyoztest();
    }

    private void kihirdetGyoztest() {
        Csiga nyertes = cs1;
        if (cs2.getTav() > nyertes.getTav()) nyertes = cs2;
        if (cs3.getTav() > nyertes.getTav()) nyertes = cs3;

        System.out.print("\nA győztes a ");

        System.out.print(nyertes.getSzin().getAnsiKod() + nyertes.getSzin().name() + Szin.RESET);
        System.out.println(" csiga.");

        if (tipp == nyertes.getSzin()) {
            System.out.println("Gratulálok, nyertél!");
        } else {
            System.out.println("Sajnos vesztettél!"); 
        }
    }
}