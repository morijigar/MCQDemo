package com.app.mcqapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Answer {

    @SerializedName("groupId")
    @Expose
    private Integer groupId;
    @SerializedName("AnswerId")
    @Expose
    private Integer answerId;
    @SerializedName("com.app.mcqapp.Answer")
    @Expose
    private String answer;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}