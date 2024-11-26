package io.github.unisim;

public class Score {
    private int score;
    private int initialScore;
    private boolean hasFinished;

    public Score(int initialScore) {
        this.initialScore = initialScore;
        score = initialScore;
        hasFinished = false;
    }

    public void reset() {
        score = initialScore;
        hasFinished = false;
    }

    public int getScore() {
        return score;
    }

    public String getScoreString() {
        return String.valueOf(score) + "%";
    }

    public void calculateScore() {
        // building should be close together
        // check that no building is far away

        // event reactions

        // achievements modifier
    }


}
