package com.olivejua.dfs;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;

public class Programmers_43164Test extends TestCase {
    Programmers_43164 sut = new Programmers_43164();

    public void test1() {
        String[][] tickets = new String[][] {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        String[] result = sut.solution(tickets);

        String[] expected = new String[] {"ICN", "JFK", "HND", "IAD"};

        Assertions.assertThat(result).containsExactly(expected);
    }

    /**
     * ICN : [ATL, SFO]
     * SFO : [ATL]
     * ATL : [ICN, SFO]
     */

    //ICN -> ATL -> ICN -> SFO -> ATL -> SFO
    public void test2() {
        String[][] tickets = new String[][] {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};

        String[] result = sut.solution(tickets);

        String[] expected = new String[] {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};

        Assertions.assertThat(result).containsExactly(expected);
    }
}