package com.example.verschluesselapp;

public class Verschluesseln {

    public static String encrypt(String input){
        char[] text = input.toCharArray();

        for (int i = 0; i < text.length; i++){
            text[i] += 3;
        }

        input = new String(text);
        return input;
    }

    public static String decrypt(String input){
        char[] text = input.toCharArray();

        for (int i = 0; i < text.length; i++){
            text[i] -= 3;
        }

        input = new String(text);
        return input;
    }
}
