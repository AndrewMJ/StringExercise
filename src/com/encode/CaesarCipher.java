package com.encode;

public class CaesarCipher {

    private static final String alph = "abcdefghijklmnopqrstuvwxyz";

    public String encode(String message, int shift) {
        String result = "";

        for(int i = 0; i < message.length(); i++) {
            if(!contain(message.charAt(i))) result += message.charAt(i);
            else result += alph.charAt((convertToInt(message.charAt(i)) + shift)%alph.length());
        }

        return result;
    }

    public String decode(String message, int shift) {
        String result = "";

        for(int i = 0; i < message.length(); i++) {
            if(!contain(message.charAt(i))) result += message.charAt(i);
            else {
                int index = convertToInt(message.charAt(i)) - shift;
                if(index < 0) index = 26 + index;
                result += alph.charAt(index%alph.length());
            }
        }

        return result;
    }

    public int convertToInt(char singleChar) {
        int result = -1;
        for(int i = 0; i < alph.length(); i++) {
            if(singleChar == alph.charAt(i)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public boolean contain(char singleChar) {
        for(int i = 0; i < alph.length(); i++) {
            if(alph.charAt(i) == singleChar) {
                return true;
            }
        }
        return false;
    }
}
