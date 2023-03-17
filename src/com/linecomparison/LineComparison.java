package com.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of Line 1");
        System.out.println("Enter the x1 co-ordinate of Line 1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the y1 co-ordinate of Line 1: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the x2 co-ordinate of Line 1: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the y2 co-ordinate of Line 1: ");
        double y2 = sc.nextDouble();

        System.out.println("Enter the co-ordinates of Line 2");
        System.out.println("Enter the x1 co-ordinate of Line 2: ");
        double m1 = sc.nextDouble();
        System.out.println("Enter the y1 co-ordinate of Line 2: ");
        double n1 = sc.nextDouble();
        System.out.println("Enter the x2 co-ordinate of Line 2: ");
        double m2 = sc.nextDouble();
        System.out.println("Enter the y2 co-ordinate of Line 2: ");
        double n2 = sc.nextDouble();

        sc.close();

        double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double length2 = Math.sqrt(Math.pow((m2 - m1), 2) + Math.pow((n2 - n1), 2));

        if (length1 == length2){
            System.out.println("The lengths of two lines are equal.");
        } else if (length1>length2){
            System.out.println("Line 1 is longer than Line 2.");
        }
        else {
            System.out.println("Line 2 is longer than Line 1.");
        }
    }
}
