package com.fju;

public class StarPyramid {
    public static void main(String[] args) {
        for (int i = 0; i<9; i++){
            for (int j = 0; j< 17; j++){
                if (i == 8){
                    System.out.print("*");
                }else if (i == 7){
                    if (j==0 || j ==16){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else if (i == 6){
                    if (j == 0 || j == 16 || j == 1 || j == 15){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else if (i == 5){
                    if (j == 0 || j == 16 || j == 1 || j == 15 || j == 2 || j == 14){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else if (i == 4){
                    if (j == 0 || j == 16 || j == 1 || j == 15 || j == 2 || j == 14 || j ==3 || j ==13){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else if (i == 3){
                    if (j == 0 || j == 16 || j == 1 || j == 15 || j == 2 || j == 14 || j ==3 || j ==13 || j == 4 || j == 12){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else if (i == 2){
                    if (j == 0 || j == 16 || j == 1 || j == 15 || j == 2 || j == 14 || j ==3 || j ==13 || j == 4 || j == 12 || j ==5 || j == 11){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else if (i ==1){
                    if (j == 0 || j == 16 || j == 1 || j == 15 || j == 2 || j == 14 || j ==3 || j ==13 || j == 4 || j == 12 || j ==5 || j == 11 || j ==6 || j ==10){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else if (i ==0){
                    if (j == 0 || j == 16 || j == 1 || j == 15 || j == 2 || j == 14 || j ==3 || j ==13 || j == 4 || j == 12 || j ==5 || j == 11 || j ==6 || j ==10 || j ==7 || j ==9){
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
