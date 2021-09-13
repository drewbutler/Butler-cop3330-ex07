/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the length of the room?");
        int roomLength = myObj.nextInt();

        System.out.println("What is the width of the room?");
        int roomwidth = myObj.nextInt();

        System.out.println("You entered dimensions of " + roomLength + " feet by " + roomwidth + " feet.");
        System.out.println("The area is");

        int area = roomLength * roomwidth;

        System.out.println(area + " squre feet");

        double conversion = 0.09290304;
        double meters = area * conversion;

        System.out.printf("%.3f square meters", meters);

        myObj.close();
    }
}