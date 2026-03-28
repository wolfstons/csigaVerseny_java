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
        +megy() void
        +rajzol() void
    }
    class Szin <<enumeration>> {
        PIROS
        ZÖLD
        KÉK
    }
    JatekIndito --> Jatek
    Jatek "1" *-- "3" Csiga
    Csiga --> Szin
