package nl.han.ooad;

public class ScoreTellerSimpel implements ScoreTeller {

    @Override
    public double bekerenScore(long tijd, int maxScore) {

        double score = maxScore - tijd;
        if (score < 0) {
            return 0;
        }

        return score;
    }
}
