package com.encode;

public class Test {

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String message = "lbh zhfg hayrnea jung lbh unir yrnearq!!!!";
        System.out.println("Encoded: " + message);
        System.out.println("Decoded: " + caesarCipher.decode(message, 13));
    }
}
