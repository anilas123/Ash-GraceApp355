package com.example.app355.Mood;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private static List<QuestionsList> MoodQuestion1(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What's your energy level today?",
                "High,I could conquer the world!",
                "Relaxed.Nothing feels urgent.",
                "Standard.Nothing is new.",
                "More than expected. I feel jittery.",
                "Very low.I feel tired and sluggish.",
                "High,I could conquer the world!",
                "Relaxed.Nothing feels urgent.",
                "Standard.Nothing is new.",
                "More than expected. I feel jittery.",
                "Very low.I feel tired and sluggish.","");



        final QuestionsList question2 = new QuestionsList("Which best describes your attitude today?",
                "I feel confident and hopeful!",
                "I feel serene and grounded.",
                "I feel easily bothered.",
                "I feel on edge.",
                "I feel apathetic and pessimistic.",
                "I feel confident and hopeful!",
                "I feel serene and grounded.",
                "I feel easily bothered.",
                "I feel on edge.",
                "I feel apathetic and pessimistic.","");

        final QuestionsList question3 = new QuestionsList("How has your appetite been today?",
                "Fine. Nothing out of the ordinary!",
                "Normal. Keeping a balanced diet.",
                "Less than normal.",
                "High. I can't stop snacking.",
                "| have no appetite.",
                "Fine. Nothing out of the ordinary!",
                "Normal. Keeping a balanced diet.",
                "Less than normal.",
                "High. I can't stop snacking.",
                "| have no appetite.","");

        final QuestionsList question4 = new QuestionsList("How did you sleep last night?",
                "Well. I sprung out of bed this morning!",
                "Comfortably. Waking up was easy.",
                "Standard.Nothing is new.",
                "I could barely sleep, my thoughts were racing.",
                "Like the dead. It was hard to get out of bed this morning.",
                "Well. I sprung out of bed this morning!",
                "Comfortably. Waking up was easy.",
                "Standard.Nothing is new.",
                "I could barely sleep, my thoughts were racing.",
                "Like the dead. It was hard to get out of bed this morning.","");

        final QuestionsList question5 = new QuestionsList("How is your mental focus today?",
                "Great! I can concentrate on finishing a task easily.",
                "Good. I feel in flow today.",
                "Alright. I can finish a task but it'll take me a while.",
                "Bad. I can barely focus to accomplish anything.",
                "Less than good. My mind has been drifting today.",
                "Great! I can concentrate on finishing a task easily.",
                "Good. I feel in flow today.",
                "Alright. I can finish a task but it'll take me a while.",
                "Bad. I can barely focus to accomplish anything.",
                "Less than good. My mind has been drifting today.","");

        final QuestionsList question6 = new QuestionsList("How have you interacted with colleagues/friends/family?",
                "I've had fun conversations, laughed a lot today!",
                "I've enjoyed listening to loved ones today.",
                "I've been less than enjoyable to interact with.",
                "I've been too in my head to pay attention",
                "I haven't really interacted with anyone",
                "I've had fun conversations, laughed a lot today!",
                "I've enjoyed listening to loved ones today.",
                "I've been less than enjoyable to interact with.",
                "I've been too in my head to pay attention",
                "I haven't really interacted with anyone","");



        final QuestionsList question7 = new QuestionsList("How would vou describe your mood?",
                "Happy",
                "Calm",
                "Annoyed",
                "Upset",
                "Sad",
                "Happy",
                "Calm",
                "Annoyed",
                "Upset",
                "Sad","");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestionList(){
        return MoodQuestion1();
    }

}
