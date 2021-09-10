package com.sg.foundations.variables;

public class MenuOfChampions {
    
    public static void main(String[] args) {
        String[] foods = new String[]{"Slice of Big Rico Pizza", "Invisible Strawberry Pie", "Denver Omelet"};
        double[] prices = new double[] {500.00, 2.00, 1.50};
    
        System.out.println("----------------------------------------------------------");
        System.out.println();
        System.out.println("        WELCOME TO RESTAURANT NIGHT VALE!");
        System.out.println("        Todays Menu Is...");
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println();
        for (int i=0; i<foods.length; i++)
            System.out.println("        $"+prices[i]+"   "+foods[i]);
    }
    
}
