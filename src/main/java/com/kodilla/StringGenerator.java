package com.kodilla;

import java.util.*;

public class StringGenerator {

    //Wygenerowanie Stringa o losowej dlugosci

    private static Random theGenerator = new Random();

    public static String generate() {
        int length = theGenerator.nextInt(50)+1;
        String aString = "";
        for(int i=0; i<length; i++){
            aString += "a";
        }
        return aString;
    }
}

class Application{
    public static void main(String[] args){

        //Wygenerowanie 50 losowych Stringow i umieszczenie ich w kolejce
        Deque<String> stringQueue = new ArrayDeque<>();
        for(int i=0; i<50; i++){
            String radnomAString = StringGenerator.generate();
            stringQueue.offer(radnomAString);
        }

        //Deklaracja dwoch list, do jednej dodajemy parzyste, do drugiej niepatzyste
        List<String> evenList = new ArrayList<>();
        List<String> oddList = new ArrayList<>();
        for(String randomAString : stringQueue){
            if (randomAString.length() % 2 == 0) {
                evenList.add(randomAString);
            } else {
                oddList.add(randomAString);
            }
        }
        System.out.println("Amount of even values: " + evenList.size());
        System.out.println("Amount of odd values: " + oddList.size());
    }
}