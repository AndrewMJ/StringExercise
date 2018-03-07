package com.company;

public class StringTranslation {

    public static String leetTranslate(String toTranslate) {
        String leetTranslated = "";
        for (int i = 0; i < toTranslate.length(); i++) {
            switch (toTranslate.toUpperCase().charAt(i)) {
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
                default:
                    leetTranslated += toTranslate.toLowerCase().charAt(i);
                    break;
            }

        }
        return leetTranslated;
    }

    //caesarDecrypt deciphers a Caesar Cipher. it takes the shift as an int key
    public static String caesarDecrypt(String cipher, int shift) {
        String decrypted = "";
        cipher = cipher.toLowerCase().trim();
        for (int i = 0; i < cipher.length(); i++){
            if(cipher.charAt(i) == ' '){
                decrypted += ' ';
            }
            else{
                char c = (char)(cipher.charAt(i) + shift);
                //Some letters get converted to a char greater than the 26th letter. Subtract 26 from these
                // to "reset" them back to the beginning of the alphabet.
                if (c > 'z'){
                    decrypted += (char)(cipher.charAt(i) - (26 - shift));
                }
                else{
                    decrypted += (char)(cipher.charAt(i) + shift);
                }
            }
        }
        return decrypted;
    }

    public static String caesarEncrypt(String cipher, int shift) {
        String encrypted = "";
        cipher = cipher.toLowerCase().trim();
        for (int i = 0; i < cipher.length(); i++){
            if(cipher.charAt(i) == ' '){
                encrypted += ' ';
            }
            else{
                char c = (char)(cipher.charAt(i) - shift);
                //Some letters get converted to a char smaller than the 1st letter. Add 26 to these
                // to "reset" them back to the end of the alphabet.
                if (c < 'a'){
                    encrypted += (char)(cipher.charAt(i) + (shift - 26));
                }
                else{
                    encrypted += (char)(cipher.charAt(i) - shift);
                }
            }
        }
        return encrypted;
    }
}