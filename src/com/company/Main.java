package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double num = Math.random();
        int num2=(int)(num* 11);
        Scanner input = new Scanner(System.in);
        System.out.println("can you guess my number");
        int guess=0;
        while (num2 != guess) {
            guess = input.nextInt();
            if(num2!=guess)
            {
                System.out.println("Guess again:"+guess);
            }
        }
        System.out.println("Correct guess " + guess);

    }
}
