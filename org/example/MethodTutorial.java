package org.example;

import java.util.Scanner;

public class MethodTutorial {

    public MethodTutorial() {
    }

    public void printString(String stringToPrint){
        System.out.println(stringToPrint);
    }

    public void userInputPrint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String for printing to console: \n");
        String input = scanner.nextLine();
        System.out.println("\nString printed: " + input);
    }

    public int addTwoNumbers(int num1, int num2){
        return num1 + num2;
    }

}
