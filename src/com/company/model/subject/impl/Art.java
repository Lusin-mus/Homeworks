package com.company.model.subject.impl;

import com.company.exception.InvalidScoreException;
import com.company.model.subject.Subject;

public class Art extends Subject {
    @Override
    public void setScore(int score) throws InvalidScoreException {
        super.setScore(score);
    }
}
