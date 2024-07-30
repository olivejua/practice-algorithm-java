package com.olivejua.string;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Map;
import java.util.PriorityQueue;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class SumOfBeautyOfAllSubstringsTest {
    private final SumOfBeautyOfAllSubstrings problem = new SumOfBeautyOfAllSubstrings();

    @Test
    public void test1() {
        String s = "aabcb";
        int result = problem.beautySum(s);

        assertThat(result).isEqualTo(5);
    }

    @Test
    public void test2() {
        String s = "aabcbaa";
        int result = problem.beautySum(s);

        assertThat(result).isEqualTo(17);
    }

    @Test
    public void test3() {
        String s = "hqyadervmdrmdphdvaxumxqyfxpbcgdsoaldxjmgjwgoazyvbyghwcaoftqdezlkdjhmiqxyydzzfxxxzyamapuxvinmyhrlzxcdasvytkvgxxgpgrqrjntwlqjxd";
        int result = problem.beautySum(s);

        assertThat(result).isEqualTo(32320);
    }

    @Test
    public void test4() {
        String s = "hiwhhrjugmpnyxzrvyxsuxeeqaecyasqdfbotrdtcglquuylygbziiaumetxklicurowfagiwgistkufvotosttvodnfknzlznorvhxqpekbraeiwiwlaleyjmzeakxxgplpophojiaiatrrjdhjbuevrjejbvsugfjjwhuiytidvujyrrchelwixarxokgwlyjaapxywseocyxvtnlagvlhwkqkatimwuetmmkgcxacmjwnybwkwbzgfauudkxejbtnndywxlswllgatfyyyafcqhbmmlmmsstosvgyqlnwqbfobztftqnsfqbwzgrdsihhzdcutypzcoiroyngtmryhjvdbluoebyxlwbrwlyqeeirpdwutahhybnkgbhlehnagtlnpeioooqhr";
        int result = problem.beautySum(s);
    }
}