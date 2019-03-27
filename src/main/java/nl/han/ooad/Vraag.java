package nl.han.ooad;

import java.util.ArrayList;

public class Vraag {

    ArrayList<Antwoord> antwoorden = new ArrayList<>();
    ArrayList<Antwoord> correcteAntwoorden = new ArrayList<>();
    private String tekst;
    private int nummer;
    private int maxScore;

    public Vraag(String tekst, int nummer, int maxScore) {
        this.tekst = tekst;
        this.nummer = nummer;
        this.maxScore = maxScore;
    }

    public void voegAntwoordToe(Antwoord antwoord, boolean correct) {
        if (correct) {
            correcteAntwoorden.add(antwoord);
        } else {
            antwoorden.add(antwoord);
        }


    }
}
