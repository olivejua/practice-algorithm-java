package com.olivejua.hash;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ListOfPhoneNumberTest {

    @Test
    public void solution() {

        String str = new String();

        char c = ' ';

        str = "안녕하세요";
        StringBuilder sb = new StringBuilder();
        sb.append("안녕하세요");


        c = str.charAt(0);

        System.out.println(c);
        System.out.println(str.equals(sb.toString()));
    }

    @Test
    public void solutionTest1() {
        String[] phone_book = {"119", "97674223", "1195524421"};

        ListOfPhoneNumber listOfPhoneNumber = new ListOfPhoneNumber();
        boolean result = listOfPhoneNumber.solution(phone_book);

        assertFalse(result);
    }

    @Test
    public void solutionTest2() {
        String[] phone_book = {"123","456","789"};

        ListOfPhoneNumber listOfPhoneNumber = new ListOfPhoneNumber();
        boolean result = listOfPhoneNumber.solution(phone_book);

        assertTrue(result);
    }

    @Test
    public void solutionTest3() {
        String[] phone_book = {"12","123","1235","567","88"};

        ListOfPhoneNumber listOfPhoneNumber = new ListOfPhoneNumber();
        boolean result = listOfPhoneNumber.solution(phone_book);

        assertFalse(result);
    }
}