package com.reverseString;

public class Main {
    public static void main(String[] args) {
        String str = "abcd";

        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(str);
        System.out.println(result);
    }
}
