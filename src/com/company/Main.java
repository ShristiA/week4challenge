package com.company;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String userAns = "Y";

        while(userAns.equalsIgnoreCase("Y")){
            System.out.println("Enter input in Fahrenheit or N to quit the program");
            int userInput = sc.nextInt();


            if (userInput > 70) {
                System.out.println("The temperature in Celsius is " + "%.2f" + celsius(userInput));
                System.out.println("The weather is a bit warm for fall");

            } else if (userInput <= 70 && userInput >= 45) {
                System.out.println("The temperature in Celsius is " + "%.2f" + celsius(userInput));
                System.out.println("Today's weather is a perfect fall day for a cup of " + randomDrinks() + "\n The color of the leaves are " + randomColors());
            } else {
                System.out.println("The temperature in Celsius is " + "%.2f" + celsius(userInput));
                System.out.println("The weather is a bit chilly for fall.");
            }
            userInput = 0;

            System.out.println("Would you like to enter another temperature Y(yes) or N(no):");
            userAns = sc.next();

            if(userAns.equalsIgnoreCase("n")){
                System.out.println("Done");
            }

        }



    }





    public static String randomColors() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("brown");
        colors.add("yellow");
        colors.add("orange");

        Random r = new Random();
        int index1 = r.nextInt(colors.size());
        String coloritem = colors.get(index1);

        return(coloritem);
    }

    public static String randomDrinks(){
        ArrayList <String> drinks = new ArrayList<>();
        drinks.add("pumpkin");
        drinks.add("spiced latte");
        drinks.add("chai tea");
        drinks.add("hot cocoa");

        Random ran = new Random();
        int index2 = ran.nextInt(drinks.size());
        String drinkItem = drinks.get(index2);

        return(drinkItem);
    }
    public static double celsius(int userInput){
        double celsius1 = userInput *(-17.22);
        return celsius1;
    }

}
