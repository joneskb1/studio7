package com.company;

public abstract class Question {

    public String question;
    public String answer1;
    public String answer2;
    public String answer3;
    public String answer4;
    public String correctAnswer1;

    public Question(String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer1) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer1 = correctAnswer1;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswers() {
        return "Choices:"+ answer1 +" "+ answer2 +" "+ answer3 + " "+answer4;
    }

    public String getCorrectAnswer1() {
        return correctAnswer1;
    }
}
