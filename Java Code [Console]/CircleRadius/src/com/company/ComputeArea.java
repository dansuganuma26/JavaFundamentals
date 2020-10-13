package com.company;

public class ComputeArea {
    public static void main(String[] args) {
        double radius; // declare radius
        double area;   // declare are
        final double PI = 3.14159D;  // initialize PI as final

        radius = 20; //assign the radius with 20

        area = PI * (radius * radius); //compute the area
        System.out.print("The area of the circle is: " + area);


    }
}
