package nl.han.ooad;

public class Score {

    private int score;

    public Score() {
        this.score = 0;
    }

    public void verhoogScore(int hoeveelheid) {
        this.score += hoeveelheid;
    }

    public int getScore() {
        return score;
    }
}
