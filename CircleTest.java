package com.company;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter your Desired radius: ");
        float rad = abc.nextFloat();
        Circle cir = new Circle(rad);
        System.out.println("Enter A for area  C for circumference    D for diameter: ");
        String L = abc.next();

        double area = cir.getArea();
        double circumference = (2*3.14159265*rad);
        double diameter = 2*rad;

        if(L.equalsIgnoreCase(("A")))
            System.out.println("The area of the circle with radius "+rad+" is "+area);

        else if(L.equalsIgnoreCase("C"))
            System.out.println("The circumference of the circle with radius "+rad+" is "+circumference);

        else if(L.equalsIgnoreCase("D"))
            System.out.println("The diameter of the circle with radius "+rad+" is "+diameter);
        else
            System.out.println("INVALID");

    }
    }

