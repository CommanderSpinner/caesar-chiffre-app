package com.example.verschluesselapp;

public class Verschluesseln {

    public static void encrypt(String input){
        char[] text = input.toCharArray();

        for (int i = 0; i < text.length; i++){
            text[i] += 3;
        }

        input = new String(text);
    }

    public static void decrypt(String input){
        char[] text = input.toCharArray();

        for (int i = 0; i < text.length; i++){
            text[i] -= 3;
        }

        input = new String(text);
    }
}
