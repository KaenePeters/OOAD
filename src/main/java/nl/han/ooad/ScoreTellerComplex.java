package nl.han.ooad;

public class ScoreTellerComplex implements ScoreTeller {

    @Override
    public double bekerenScore(long tijd, int maxScore) {
        double score = maxScore * Math.pow(0.5, tijd);
        if (score < 0) {
            return 0;
        }
        return score;
    }
}
