package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1 create two variables to represent the salary for Bob and Gary.
        // After creating a salary determine whose salary is greater using Math.max
        double bobSalary = 50000;
        double garySalary = 60000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Question 2 find and display the smallest of two variables named carPrice and truckPrice

        double carPrice = 10000.00;
        double truckPrice = 26000.00;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest vehicle price is " + lowestPrice);



         // Question 3 Find and display the area of a circle whose radius is 7.25

        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " +radius + " is " + Math.round(area));

        // Question 4  Find and display the square root a variable after it is set to 5.0
        double startingNumber = 5.0;
        double squareRoot = Math. sqrt(startingNumber);
        System.out.println("The square root at " + startingNumber + " is " + squareRoot);

        // Question 5 Find and display the distance between the point (5,10) and (85,50)
        // (x,y) (5,10) (85,50)

        int x1 = 5;
        int y1 =10;
        int x2 = 85;
        int y2= 50;
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance between ("+x1+", "+x2+") and ("+y1+", "+y2+")) is " + distance);


        // Question 6 find and display the absolute (positive) value of a variable")

        double number= -3.8;
        double absoluteValue = Math.abs(number);
        System.out.println("The absolute value is " +  absoluteValue);


        // Question 7 Find and display a random number between 0 and 1

        double randomNumber = Math.random();
        System.out.println(randomNumber + "is a random number between 0 and 1");



        // Question 8  calculate how many minutes are in 24 days, use a variable for each value


        int days = 24;
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println("There are " + minutes + "minutes in 24 days" );




























    }

}





