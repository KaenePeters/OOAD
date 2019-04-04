package nl.han.ooad;

import java.util.ArrayList;

public class ScoreSysteem {

    Score score = new Score();

    public void beantwoordVraag(Vraag vraag, String gegevenAntwoord, long tijd) {
        System.out.println("beantwoordvraag");
        ArrayList<Antwoord> antwoorden = vraag.getAntwoorden();
        ScoreTeller scoreTeller = new ScoreTellerSimpel();
        for (Antwoord antwoord : antwoorden) {
            System.out.println(gegevenAntwoord+ "gegeven antwoord");
            System.out.println(antwoord+ "antwoord");
            if (gegevenAntwoord.equals(antwoord)) {
                if (antwoord.isCoorect()) {
                    int verhoogscore = (int) scoreTeller.bekerenScore(tijd, vraag.getMaxScore());
                    score.verhoogScore(verhoogscore);
                }
            }
        }

    }
}
