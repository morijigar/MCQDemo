package com.app.mcqapp;

public class NextClickEvent {

    private Question question;

    NextClickEvent(Question question){
        this.question = question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Question getQuestion() {
        return question;
    }
}
