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
        ZOLD
        KEK
    }

    JatekIndito --> Jatek : "start"
    Jatek "1" *-- "3" Csiga : "contains"
    Csiga --> Szin : "has"
    Jatek ..> Szin : "betting"

    JatekIndito --> Jatek : elindítja
    Jatek "1" *-- "3" Csiga : tartalmazza 
    Csiga --> Szin : azonosítja 
    Jatek ..> Szin : fogadáshoz használja
