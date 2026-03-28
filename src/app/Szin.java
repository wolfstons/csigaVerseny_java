package app;

public enum Szin {
    PIROS("\u001B[31m"), 
    ZÖLD("\u001B[32m"), 
    KÉK("\u001B[34m");

    private final String ansiKod;

    Szin(String ansiKod) {
        this.ansiKod = ansiKod;
    }

    public String getAnsiKod() {
        return ansiKod;
    }


    public static final String RESET = "\u001B[0m";
}