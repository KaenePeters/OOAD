package nl.han.ooad;

public class Antwoord {
    private String tekst;
    private int nr;
    private boolean coorect;

    public Antwoord(int nr, String tekst, boolean coorect) {
        this.tekst = tekst;
        this.nr = nr;
        this.coorect = coorect;
    }

    public boolean isCoorect() {
        return coorect;
    }

    public int getNr() {
        return nr;
    }
}
