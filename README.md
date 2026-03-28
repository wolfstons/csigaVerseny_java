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

    class Szin {
        <<enumeration>>
        PIROS
        ZÖLD
        KÉK
        -ansiKod: String
        +getAnsiKod() String
    }

    JatekIndito --> Jatek : elindítja [cite: 29]
    Jatek "1" *-- "3" Csiga : tartalmazza [cite: 29]
    Csiga --> Szin : azonosítja [cite: 7, 35]
    Jatek ..> Szin : fogadáshoz használja [cite: 8, 36]
