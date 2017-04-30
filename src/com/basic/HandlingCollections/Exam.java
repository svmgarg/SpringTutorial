package com.basic.HandlingCollections;

import java.util.List;

/**
 * Created by svmga on 04-Apr-17.
 */
public class Exam {

    private String examId;
    private String examName;
    private List<Question> questions;

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId='" + examId + '\'' +
                ", examName='" + examName + '\'' +
                ", questions=" + questions +
                '}';
    }
}
