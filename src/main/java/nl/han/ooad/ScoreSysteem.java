package nl.han.ooad;

import java.util.ArrayList;

public class ScoreSysteem {

    Score score = new Score();

    public void beantwoordVraag(Vraag vraag, String gegevenAntwoord, long tijd) {
        if (vraag != null) {
            ArrayList<Antwoord> antwoorden = vraag.getAntwoorden();
            //scoretellersimpel of scoretellercomplex
            ScoreTeller scoreTeller = new ScoreTellerSimpel();
            for (Antwoord antwoord : antwoorden) {
                if (gegevenAntwoord.equals(antwoord.getTekst())) {
                    if (antwoord.isCoorect()) {
                        int verhoogscore = (int) scoreTeller.bekerenScore(tijd, vraag.getMaxScore());
                        score.verhoogScore(verhoogscore);
                    }
                }
            }
        }
    }
}
