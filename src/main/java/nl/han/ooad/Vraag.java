package nl.han.ooad;

import java.util.ArrayList;

public class Vraag {

    ArrayList<Antwoord> antwoorden = new ArrayList<>();

    private String tekst;
    private int nummer;
    private int maxScore;

    public Vraag(String tekst, int nummer, int maxScore) {
        this.tekst = tekst;
        this.nummer = nummer;
        this.maxScore = maxScore;
    }

    public void voegAntwoordToe(int nr, String tekst, boolean correct) {
        Antwoord antwoord = new Antwoord(nr,tekst,correct);
        antwoorden.add(antwoord);
    }

    public ArrayList<Antwoord> getAntwoorden(){
        return antwoorden;
    }

    public int getNummer() {
        return nummer;
    }


    public int getMaxScore() {
        return maxScore;
    }
}
