package me.timtim17.dev.java.apcs.projectstructuretest.project1;

import java.util.Random;

public class Project {
    public static final Question QUESTION_LIFE_THE_UNIVERSE_AND_EVERYTHING = new Question();
    public static final Question QUESTION_ARE_WE_THERE_YET = new Question("Are we there yet?");
    public static final Question QUESTION_WHATS_FOR_LUNCH = new Question("What's for lunch?");

    protected static final String[] FOOD = {"hamburgers", "pizza", "noodles", "rice", "sandwiches", "motor oil", "nothing"};

    public static void main(String[] args) {
        System.out.println(QUESTION_LIFE_THE_UNIVERSE_AND_EVERYTHING);
        System.out.println(answer(QUESTION_LIFE_THE_UNIVERSE_AND_EVERYTHING));
        System.out.println();
        System.out.println(QUESTION_ARE_WE_THERE_YET);
        System.out.println(answer(QUESTION_ARE_WE_THERE_YET));
        System.out.println();
        System.out.println(QUESTION_WHATS_FOR_LUNCH);
        System.out.println(answer(QUESTION_WHATS_FOR_LUNCH));
    }

    /**
     * Returns an answer based upon the passed in question.
     *
     * @param question The question asked.
     * @return The answer to the passed in question, or {@code null} if an invalid question is passed in.
     */
    public static Object answer(Question question) {
        if (question.equals(QUESTION_LIFE_THE_UNIVERSE_AND_EVERYTHING)) {
            return 42;
        }

        Random rand = new Random();
        if (question.equals(QUESTION_ARE_WE_THERE_YET)) {
            // 10% chance of yes, 90% chance of no
            int chance = rand.nextInt(100); // generate a number between 0 and 99
            return chance < 89 ? "No" : "Yes"; // if the number is from 0 to 88, answer no. if the answer is between 89 and 99, answer yes.
        } else if (question.equals(QUESTION_WHATS_FOR_LUNCH)) {
            return FOOD[rand.nextInt(FOOD.length)];
        } else return null;
    }
}
