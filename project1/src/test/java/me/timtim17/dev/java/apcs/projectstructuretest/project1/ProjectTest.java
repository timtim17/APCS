package me.timtim17.dev.java.apcs.projectstructuretest.project1;

import static me.timtim17.dev.java.apcs.projectstructuretest.project1.Project.answer;
import static me.timtim17.dev.java.apcs.projectstructuretest.project1.Project.FOOD;
import static me.timtim17.dev.java.apcs.projectstructuretest.project1.Project.QUESTION_LIFE_THE_UNIVERSE_AND_EVERYTHING;
import static me.timtim17.dev.java.apcs.projectstructuretest.project1.Project.QUESTION_ARE_WE_THERE_YET;
import static me.timtim17.dev.java.apcs.projectstructuretest.project1.Project.QUESTION_WHATS_FOR_LUNCH;
import static org.apache.commons.lang3.ArrayUtils.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.Matchers;
import org.junit.Test;

public class ProjectTest {
    @Test
    public void testAnswer_validQuestions() {
        assertEquals(42, answer(QUESTION_LIFE_THE_UNIVERSE_AND_EVERYTHING));
        assertThat(answer(QUESTION_ARE_WE_THERE_YET), Matchers.<Object>isOneOf("Yes", "No"));
        assertTrue(contains(FOOD, answer(QUESTION_WHATS_FOR_LUNCH)));
    }

    @Test
    public void testAnswer_invalidQuestion() {
        assertNull(answer(new Question("invalid")));
    }
}