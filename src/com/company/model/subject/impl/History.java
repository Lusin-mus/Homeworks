package com.company.model.subject.impl;

import com.company.exception.InvalidScoreException;
import com.company.model.subject.Subject;

public class History extends Subject {
    @Override
    public void setScore(int score) throws InvalidScoreException {
        super.setScore(score);
    }
}
