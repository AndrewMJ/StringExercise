package com.company;
import java.lang.StringBuilder;

public class StringManipulation {


    public static String concat(String str1, String str2){
        return str1 + " " + str2;
    }

    public static int length(String str){
        System.out.println(str.length());
        return str.length();
    }

    public static String printUpper(String str){
        System.out.println(str.toUpperCase());
        return str.toUpperCase();
    }

    public static String printLower(String str){
        System.out.println(str.toLowerCase());
        return str.toLowerCase();
    }

    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        return sb.reverse().toString();
    }



}
