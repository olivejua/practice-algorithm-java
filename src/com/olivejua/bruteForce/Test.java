package com.olivejua.bruteForce;

public class Test {
    public static void main(String[] args) {
        String target = "picture";
        String str = "turepic";
        int idxOfFirstChar = str.indexOf(target.toCharArray()[0]);

        StringBuilder sb = new StringBuilder().append(str.substring(idxOfFirstChar)).append(str.substring(0, idxOfFirstChar));

        System.out.println("sb.toString() = " + sb);
        System.out.println("sb.equals(target) = " + sb.equals(target));
        System.out.println("sb.equals(target) = " + sb.toString().equals(target));
    }
}
