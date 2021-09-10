package com.sg.foundations.userinput;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        String a, b, c, d, e, f, g, h, i, j;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!");
        System.out.println();
        System.out.println("I need a noun:");
        a = inputReader.nextLine();
        System.out.println("Now an adjective:");
        b = inputReader.nextLine();
        System.out.println("Another noun:");
        c = inputReader.nextLine();
        System.out.println("And a number:");
        d = inputReader.nextLine();
        System.out.println("Another adjective:");
        e = inputReader.nextLine();
        System.out.println("A plural noun:");
        f = inputReader.nextLine();
        System.out.println("Another one:");
        g = inputReader.nextLine();
        System.out.println("One more:");
        h = inputReader.nextLine();
        System.out.println("A verb (infinitive form):");
        i = inputReader.nextLine();
        System.out.println("Same verb (past participle):");
        j = inputReader.nextLine();
        System.out.println();
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(a+": the "+b+" frontier. These are the voyages of the starship "+c+". Its "+d+"-year mission: to explore strange "+e+" "+f+", to seek out "+e+" "+g+" and "+e+" "+h+", to boldly "+i+" where no one has "+j+" before.");
    }
}
