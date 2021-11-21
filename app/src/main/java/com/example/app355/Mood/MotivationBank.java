package com.example.app355.Mood;

import java.util.ArrayList;
import java.util.List;

public class MotivationBank {

    /*
     * List for the Happy mood
     * please feel free to type anything that you would like the users to know when they get this mood
     */
    private static List<MotivationList> ForHappy(){
        final List<MotivationList> ForHappy = new ArrayList<>();

        final MotivationList line1 = new MotivationList("1");

        final MotivationList line2 = new MotivationList("2");

        final MotivationList line3 = new MotivationList("3");

        final MotivationList line4 = new MotivationList("4");

        final MotivationList line5 = new MotivationList("5");

        ForHappy.add(line1);
        ForHappy.add(line2);
        ForHappy.add(line3);
        ForHappy.add(line4);
        ForHappy.add(line5);

        return ForHappy;
    }

    /*
     * List for the Calm mood
     * please feel free to type anything that you would like the users to know when they get this mood
     */
    private static List<MotivationList> ForCalm(){
        final List<MotivationList> ForCalm = new ArrayList<>();

        final MotivationList line1 = new MotivationList("6");

        final MotivationList line2 = new MotivationList("7");

        final MotivationList line3 = new MotivationList("8");

        final MotivationList line4 = new MotivationList("9");

        final MotivationList line5 = new MotivationList("10");


        ForCalm.add(line1);
        ForCalm.add(line2);
        ForCalm.add(line3);
        ForCalm.add(line4);
        ForCalm.add(line5);

        return ForCalm;
    }

    /*
     * List for the Annoyed mood
     * please feel free to type anything that you would like the users to know when they get this mood
     */
    private static List<MotivationList> ForAnnoyed(){
        final List<MotivationList> ForAnnoyed = new ArrayList<>();

        final MotivationList line1 = new MotivationList("11");

        final MotivationList line2 = new MotivationList("12");

        final MotivationList line3 = new MotivationList("13");

        final MotivationList line4 = new MotivationList("14");

        final MotivationList line5 = new MotivationList("15");

        ForAnnoyed.add(line1);
        ForAnnoyed.add(line2);
        ForAnnoyed.add(line3);
        ForAnnoyed.add(line4);
        ForAnnoyed.add(line5);

        return ForAnnoyed;
    }

    /*
     * List for the Upset mood
     * please feel free to type anything that you would like the users to know when they get this mood
     */
    private static List<MotivationList> ForUpset(){
        final List<MotivationList> ForUpset = new ArrayList<>();

        final MotivationList line1 = new MotivationList("16");

        final MotivationList line2 = new MotivationList("17");

        final MotivationList line3 = new MotivationList("18");

        final MotivationList line4 = new MotivationList("19");

        final MotivationList line5 = new MotivationList("20");

        ForUpset.add(line1);
        ForUpset.add(line2);
        ForUpset.add(line3);
        ForUpset.add(line4);
        ForUpset.add(line5);

        return ForUpset;
    }

    /*
     * List for the Sad mood
     * please feel free to type anything that you would like the users to know when they get this mood
     */
    private static List<MotivationList> ForSad(){
        final List<MotivationList> ForSad = new ArrayList<>();

        final MotivationList line1 = new MotivationList("So today was a bit of a cock-up. Meh. " +
                "It’s okay to be messy. Forgive yourself and hope for a radder tomorrow.");

        final MotivationList line2 = new MotivationList("22");

        final MotivationList line3 = new MotivationList("23");

        final MotivationList line4 = new MotivationList("24");

        final MotivationList line5 = new MotivationList("25");

        ForSad.add(line1);
        ForSad.add(line2);
        ForSad.add(line3);
        ForSad.add(line4);
        ForSad.add(line5);

        return ForSad;
    }

    public static List<MotivationList> getHappyLines(){
        return ForHappy();
    }

    public static List<MotivationList> getCalmLines(){
        return ForCalm();
    }

    public static List<MotivationList> getAnnoyedLines(){
        return ForAnnoyed();
    }

    public static List<MotivationList> getUpsetLines(){
        return ForUpset();
    }

    public static List<MotivationList> getSadLines(){
        return ForSad();
    }

}
