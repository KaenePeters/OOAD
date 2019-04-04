package nl.han.ooad;

public class Student {


    private int score;
    private String naam;
    private Uitvoering uitvoering;

    public Student(String naam, Lokaal lokaal) {
        this.naam = naam;
        Lokaal lokaal1 = lokaal;

    }


    public String getNaam() {
        return naam;
    }

    public int getScore() {
        return score;
    }

    public void voerToetsUit() {
        ScoreSysteem scoreSysteem = new ScoreSysteem();
        long gelopenTijdVraag = System.currentTimeMillis();
        int aantalVragen = uitvoering.getKennistoets().getAantalVragen();
        for (int i = 0; aantalVragen < i; aantalVragen++) {
            Vraag huidigeVraag = uitvoering.volgendeVraag(i);
            scoreSysteem.beantwoordVraag(huidigeVraag, "features en requirements", gelopenTijdVraag);
            long huidgeTijd = System.currentTimeMillis();
            gelopenTijdVraag = huidgeTijd - gelopenTijdVraag;
        }
        score = scoreSysteem.score.getScore();
    }

    public void setUitvoering(Uitvoering uitvoering) {
        this.uitvoering = uitvoering;
    }
}
