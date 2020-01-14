package com.company.subject;

public class Subject {

    private int score;

    public Subject(int score) throws Exception {
        throwIfInvalidScore(score);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) throws Exception {
        throwIfInvalidScore(score);
        this.score = score;
    }

    public void throwIfInvalidScore(int score) throws Exception {
        if (score < 0 || score > 10) {
            throw new Exception("Invalid score: " + score);
        }
    }
}


