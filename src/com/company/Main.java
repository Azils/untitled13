package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>color= new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Black");
        System.out.println(color);

        ArrayList<String>color1 = new ArrayList<>(6);
        color1.add("White");
        color1.add("Pink");
        color1.add("Yellow");
        color.addAll(color1);
        System.out.println(color);
        Collections.sort(color);
        System.out.println(color);
        Collections.reverse(color);
        System.out.println(color);
        Collections.shuffle(color);
        System.out.println(color);
    }
}
