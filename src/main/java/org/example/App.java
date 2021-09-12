package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int userInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of the month:");
        userInput = sc.nextInt();

        String m;
        switch (userInput) {
            case 1:  m = "January";
                break;
            case 2:  m = "February";
                break;
            case 3:  m = "March";
                break;
            case 4:  m = "April";
                break;
            case 5:  m = "May";
                break;
            case 6:  m = "June";
                break;
            case 7:  m = "July";
                break;
            case 8:  m = "August";
                break;
            case 9:  m = "September";
                break;
            case 10: m = "October";
                break;
            case 11: m = "November";
                break;
            case 12: m = "December";
                break;
            default: m = "Not a correct month";
                break;
        }
        System.out.println("The name of the month is " + m + ".");

        sc.close();
    }
}

