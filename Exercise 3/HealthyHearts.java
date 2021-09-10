package com.sg.foundations.userinput;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        int age, maxHR;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What is your age?");
        age = Integer.parseInt(inputReader.nextLine());
        maxHR = 220-age;
        System.out.println("Your maximum heart rate should be "+maxHR+" beats per minute.");
        System.out.println("Your target HR Zone is "+(maxHR*0.5)+" - "+(maxHR*0.85)+" beats per minute.");
    }
}
