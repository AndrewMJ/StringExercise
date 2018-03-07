package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Concatenation
        String str1 = "Java";
        String str2 = "Programming";
	    String builder = StringManipulation.concat(str1, str2);
        System.out.println(builder);

        //Finding Length
        StringManipulation.length(builder);

        //Uppercase and Lowercase
        String str3 = "ABcdeF";
        StringManipulation.printUpper(str3);
        StringManipulation.printLower(str3);

        //Reverse String
        String str8 = "Today is Tuesday and tomorrow is Wednesday";
        StringManipulation.reverse(str8);

        //FIND ME!
        String [] students = {"Dina", "Shane", "NaDario", "Amber", "Calder", "Noelle", "Donell"};
        String [] searchNames ={"Noelle", "Jake", "NaDario", "Dina"};
        System.out.println(StringParsing.findStudents(students, searchNames));
        System.out.println(StringParsing.findStudents(students,"Shane"));

        //Crawling Friday
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = console.readLine();
//            StringInput stringInput = new StringInput();
//            stringInput.friday(input.toCharArray());
//        } catch(IOException e) {}

        //Leetspeak
        String st9 = "leet speak";
        String sixFlags = "Sign up for our park newsletter and we’ll let you know immediately if you’ve won two tickets to Six Flags!";
        System.out.println(StringTranslation.leetTranslate(sixFlags));

        //Letter_histogram
        Map<Character, Integer> tally = StringMapping.letter_histogram("hi");
        System.out.println(tally.toString());
        System.out.println();

        //Caesar Cipher
//        String cipher = "lbh zhfg hayrnea jung lbh unir yrnearq";
//        System.out.println(StringTranslation.caesarDecrypt(cipher, 13));
        String cipherTest = "What would you like for dinner";
        System.out.println(cipherTest);
        String decyptedTest = StringTranslation.caesarEncrypt(cipherTest, 10);
        System.out.println(decyptedTest);
        System.out.println(StringTranslation.caesarDecrypt(decyptedTest, 10));
    }
}
