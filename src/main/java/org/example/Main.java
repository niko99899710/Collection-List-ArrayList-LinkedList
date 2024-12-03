package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> color = new ArrayList<>();
       color.add("green");
       color.add("blue");
       color.add("yellow");
       color.add("red");
       boolean findColor = color.contains("red");
       System.out.println(findColor);

       List <Integer> number = new LinkedList<>();
       number.add(1);
       number.add(2);
       number.add(3);
       number.add(4);
       number.add(5);
       number.set(0,5);
       number.set(4,1);
       System.out.println(number);
    }
}