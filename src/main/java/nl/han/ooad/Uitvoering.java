package nl.han.ooad;

public class Uitvoering {

    private int code;
    private Kennistoets kennistoets;
    private Lokaal lokaal;
    private Score score;

    public Uitvoering(int code, Kennistoets kennistoets, Lokaal lokaal) {
        this.code = code;
        this.kennistoets = kennistoets;
        this.lokaal = lokaal;
    }
}
