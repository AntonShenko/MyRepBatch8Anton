package com.syntax.class16;

public class ReplIt04 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Hello ");
        str.append("World");
        String upper = str.toString();
        System.out.println(upper.toUpperCase());
    }
}
