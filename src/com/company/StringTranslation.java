package com.company;

public class StringTranslation {

    public static String leetTranslate(String toTranslate){
        String leetTranslated = "";
        for(int i = 0; i < toTranslate.length(); i++) {
            switch (toTranslate.toUpperCase().charAt(i)){
                case 'A':
                    leetTranslated += 4;
                    break;
                case 'E':
                    leetTranslated += 3;
                    break;
                case 'G':
                    leetTranslated += 6;
                    break;
                case 'I':
                    leetTranslated += 1;
                    break;
                case 'O':
                    leetTranslated += 0;
                    break;
                case 'S':
                    leetTranslated += 5;
                    break;
                case 'T':
                    leetTranslated += 7;
                    break;
                default :
                    leetTranslated += toTranslate.toLowerCase().charAt(i);
                    break;
            }

        }
        return leetTranslated;
    }

}
