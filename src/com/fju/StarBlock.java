package com.fju;

import java.util.Scanner;

public class StarBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        for (int i = 0; i<8; i++){
            for (int j = 0; j<20; j++){
                if (j >= firstNumber-1 && j <= secondNumber-1){
                    System.out.print("*");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
