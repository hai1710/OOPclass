package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        quadraticEquation quadratic = new quadraticEquation(a, b, c);
        if (a != 0) {
            double delta = quadratic.getDiscriminant();
            if (delta >= 0) {
                if (delta > 0) {
                    System.out.println("the equation has 2 solutions: ");
                    System.out.println("root 1 = " + quadratic.getRoot1());
                    System.out.println("root 2 = " + quadratic.getRoot2());
                } else {
                    System.out.println("The only solution is:");
                    System.out.println("root " + quadratic.getRoot2());
                }
            } else {
                System.out.println("the equation has no solution");
            }
        }
    }
}