package me.timtim17.dev.java.apcs.projectstructuretest.project1;

class Question {
    private final String question;

    public Question(String question) {
        this.question = question;
    }

    public Question() {
        this("What is the answer to life, the universe, and everything?");
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return question;
    }
}
