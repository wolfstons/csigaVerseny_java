# Csigaverseny Projekt

[cite_start]Ez a dokumentum a Csigaverseny alkalmazás szerkezeti felépítését mutatja be a megadott specifikáció alapján[cite: 5, 8, 29].

## UML Osztálydiagram

[cite_start]A rendszer három fő komponensből áll: egy indító osztályból, a játéklogikát vezérlő osztályból és a versenyző csigákat reprezentáló objektumokból[cite: 29].

```mermaid
classDiagram
    class JatekIndito {
        +main(args: String[]) void
    }

    class Jatek {
        -cs1: Csiga
        -cs2: Csiga
        -cs3: Csiga
        -tipp: Szin
        +start() void
        -kihirdetGyoztest() void
    }

    class Csiga {
        -szin: Szin
        -osszTav: int
        -utVonal: String
        -rnd: Random
        +megy() void
        +rajzol() void
        +getTav() int
        +getSzin() Szin
    }

    class Szin <<enumeration>> {
        PIROS
        ZÖLD
        KÉK
        +ansiKod: String
        +getAnsiKod() String
    }

    JatekIndito --> Jatek : példányosítja és indítja
    Jatek "1" *-- "3" Csiga : tartalmazza a versenyzőket
    Csiga --> Szin : rendelkezik egy színnel
    Jatek ..> Szin : használja a fogadáshoz
