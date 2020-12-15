package com.company;

import java.util.Scanner;

public class Praemienvergabe {

    public static void main(String[] args) {
        String name;
        int age;
        int company;
        Scanner input = new Scanner(System.in);
        System.out.println("Bekommen Sie eine Prämie?");
        System.out.print("Geben Sie ihren Namen ein: ");
        name = input.next();
        System.out.print("Geben Sie ihr Alter ein: ");
        age = input.nextInt();
        System.out.print("Wie lange arbeiten Sie schon in der der Firma? ");
        company = input.nextInt();

        if (age >= 35) {
            if (company >= 25) {
                System.out.println(name);
                System.out.println(age + " Jahre alt");
                System.out.println("Ist seit " + company + " Jahren in der Firma!");
                System.out.println("bekommt 550 Euro");
            } else {
                System.out.println(name);
                System.out.println(age + " Jahre alt");
                System.out.println("Ist seit " + company + " Jahren in der Firma!");
                System.out.println("bekommt 500 Euro");
            }

             }else{
                System.out.println(name);
                System.out.println(age + " Jahre alt");
                System.out.println("Ist seit " + company + " Jahren in der Firma!");
                System.out.println("bekommt leider nichts!");

        }
        }
    }
