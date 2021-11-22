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

        final MotivationList line1 = new MotivationList("Sounds like you're walking on sunshine! Shine on for those around you."); //<-- type here

        final MotivationList line2 = new MotivationList("Don't worry, keep being happy!"); //<-- type here

        final MotivationList line3 = new MotivationList("3"); //<-- type here

        final MotivationList line4 = new MotivationList("4"); //<-- type here

        final MotivationList line5 = new MotivationList("5"); //<-- type here

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

        final MotivationList line1 = new MotivationList("Keep calm and carry on."); //<-- type here

        final MotivationList line2 = new MotivationList("7"); //<-- type here

        final MotivationList line3 = new MotivationList("8"); //<-- type here

        final MotivationList line4 = new MotivationList("9"); //<-- type here

        final MotivationList line5 = new MotivationList("10"); //<-- type here


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

        final MotivationList line1 = new MotivationList("Everyone has off days! Practice self care to feel better."); //<-- type here

        final MotivationList line2 = new MotivationList("People getting on your nerves? Remember it's okay to set boundaries."); //<-- type here

        final MotivationList line3 = new MotivationList("13"); //<-- type here

        final MotivationList line4 = new MotivationList("14"); //<-- type here

        final MotivationList line5 = new MotivationList("15"); //<-- type here

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

        final MotivationList line1 = new MotivationList("Everybody has those days! Try talking through your feelings with a loved one."); //<-- type here

        final MotivationList line2 = new MotivationList("17"); //<-- type here

        final MotivationList line3 = new MotivationList("18"); //<-- type here

        final MotivationList line4 = new MotivationList("19"); //<-- type here

        final MotivationList line5 = new MotivationList("20"); //<-- type here

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

        final MotivationList line2 = new MotivationList("There's always a rainbow after a storm! Keep your head up."); //<-- type here

        final MotivationList line3 = new MotivationList("23"); //<-- type here

        final MotivationList line4 = new MotivationList("24"); //<-- type here

        final MotivationList line5 = new MotivationList("25"); //<-- type here

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
