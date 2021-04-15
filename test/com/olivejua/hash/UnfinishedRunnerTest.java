package com.olivejua.hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnfinishedRunnerTest {

    @Test
    public void solutionTest1() {

        UnfinishedRunner unfinishedRunner = new UnfinishedRunner();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String result = unfinishedRunner.solution(participant, completion);

        assertEquals("leo", result);
    }

    @Test
    public void solutionTest2() {

        UnfinishedRunner unfinishedRunner = new UnfinishedRunner();

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String result = unfinishedRunner.solution(participant, completion);

        assertEquals("vinko", result);
    }

    @Test
    public void solutionTest3() {

        UnfinishedRunner unfinishedRunner = new UnfinishedRunner();

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String result = unfinishedRunner.solution(participant, completion);

        assertEquals("mislav", result);
    }
}