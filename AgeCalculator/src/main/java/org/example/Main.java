package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter your Age: ");
        int age = scanner.nextInt();
        int yearsLeft = 100 - age;
        System.out.println("You have "+ yearsLeft+ " Years left before you become 100 years older& wiser :)")
        ;
    }
}