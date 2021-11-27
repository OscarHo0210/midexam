package com.fju;

import java.util.Scanner;

public class StarBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();
        int i = 1;
        while (i < 8){
            int j = 1;
            while (j < 20){
                switch (j){
                    case 3:
                    case 4:
                    case 5:
                        System.out.print("*");
                        break;
                    default:
                        System.out.print("0");
                        break;
                }
                j++;
            }
            i++;
            System.out.println();
        }


        /*for (int i = 0; i<8; i++){
            for (int j = 0; j<20; j++){
                if (firstNumber-1 <= j && j <= secondNumber-1){
                    System.out.print("*");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }*/

    }
}
