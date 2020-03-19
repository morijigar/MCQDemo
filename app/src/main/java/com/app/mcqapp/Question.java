package com.app.mcqapp;

import android.view.View;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Question implements Serializable {

    @SerializedName("question")
    @Expose
    private String question;
    @SerializedName("questionId")
    @Expose
    private Integer questionId;
    @SerializedName("MultipleChoice")
    @Expose
    private Boolean multipleChoice;
    @SerializedName("AnswerId")
    @Expose
    private Integer answerId;
    @SerializedName("Answers")
    @Expose
    private List<Answer> answers = null;

    private int mySelectedId = 0;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Boolean getMultipleChoice() {
        return multipleChoice;
    }

    public void setMultipleChoice(Boolean multipleChoice) {
        this.multipleChoice = multipleChoice;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public int getMySelectedId() {
        return mySelectedId;
    }

    public void setMySelectedId(int mySelectedId) {
        this.mySelectedId = mySelectedId;
    }
}