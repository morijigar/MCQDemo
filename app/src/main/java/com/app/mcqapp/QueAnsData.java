package com.app.mcqapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QueAnsData {

@SerializedName("questions")
@Expose
private List<Question> questions = null;

public List<Question> getQuestions() {
return questions;
}

public void setQuestions(List<Question> questions) {
this.questions = questions;
}

}