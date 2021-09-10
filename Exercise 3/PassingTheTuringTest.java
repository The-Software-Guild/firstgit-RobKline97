package com.sg.foundations.userinput;

import java.util.Scanner;

public class PassingTheTuringTest {
    
    public static void main(String[] args) {
        String name, color, food;
        int number;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Hey! What's your name?");
        name = inputReader.nextLine();
        System.out.println("Hi "+name+"! I'm Rob.");
        System.out.println("What's your favorite color?");
        color = inputReader.nextLine();
        System.out.println("My favorite color is "+color+" too!");
        System.out.println("And your favorite food?");
        food = inputReader.nextLine();
        System.out.println("I'm not a fan of "+food+".");
        System.out.println("How about your favorite number?");
        number = Integer.parseInt(inputReader.nextLine());
        System.out.println(number+" is cool, but I like "+(number+1));
        System.out.println("Anyways, I've got to go. Bye!");
    }
    
}
