package nl.han.ooad;

public class Uitvoering {

    private int code;
    private Kennistoets kennistoets;
    private Lokaal lokaal;
//    private Score[] scores;
    private int tijd;

    public Uitvoering(int code, Kennistoets kennistoets, Lokaal lokaal, int tijd) {
        this.code = code;
        this.kennistoets = kennistoets;
        this.lokaal = lokaal;
        this.tijd = tijd;
    }

    public Vraag volgendeVraag(int huidigeVraag){
        huidigeVraag++;
        return kennistoets.getVraag(huidigeVraag);
    }


    public Kennistoets getKennistoets() {
        return kennistoets;
    }
}
