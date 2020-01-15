package com.company.model.subject;

import com.company.exception.InvalidScoreException;

public class Subject {

    private int score;
    private final int minScore=0;
    private final int maxScore=10;

    public Subject(int score) throws Exception {
        throwIfInvalidScore(score);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) throws InvalidScoreException {
        throwIfInvalidScore(score);
        this.score = score;
    }

    public void throwIfInvalidScore(int score) throws InvalidScoreException {
        if (score < minScore || score > maxScore) {
            throw new InvalidScoreException("Invalid score: " + score);
        }
    }
}


