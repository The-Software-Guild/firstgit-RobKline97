package com.sg.foundations.userinput;

import java.util.Scanner;

public class AllTheTrivia {
    
    public static void main(String[] args) {
        String a1, a2, a3, a4;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        a1 = inputReader.nextLine();
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
        a2 = inputReader.nextLine();
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        a3 = inputReader.nextLine();
        System.out.println("What is the most abundant element in the earth's atmosphere?");
        a4 = inputReader.nextLine();
        
        System.out.println("Wow, 1,024 Gigabytes is a "+a3+"!");
        System.out.println("I didn't know that the largest ever volcano was discovered on "+a1+"!");
        System.out.println("That's amazing that "+a2+" is the most abundant element in the atmosphere...");
        System.out.println(a4+" is the only planet that rotates clockwise, neat!");
    }
    
}
