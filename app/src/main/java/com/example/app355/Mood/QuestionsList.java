package com.example.app355.Mood;

public class QuestionsList {

    private String question, option1, option2, option3, option4, option5, happy,calm,annoyed,upset,sad;
    private String userSelectedAnswer;

    public QuestionsList(String question, String option1, String option2, String option3, String option4, String option5,
                         String happy,String calm, String annoyed, String upset, String sad, String userSelectedAnswer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.happy = happy;
        this.calm = calm;
        this.annoyed = annoyed;
        this.upset = upset;
        this.sad = sad;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getOption5() {
        return option5;
    }

    public String getHappy() {
        return happy;
    }

    public String getCalm() {
        return calm;
    }

    public String getAnnoyed() {
        return annoyed;
    }

    public String getUpset() {
        return upset;
    }

    public String getSad() {
        return sad;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }
}

