package com.adisekar;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Time complexity worst case analysis
        // Adding element - O(1)
        // Get Moving Average of last N elements - O(1)
        // Get last N elements - O(1)

        int N = 3; // size
        MovingAverage movingAverage = new MovingAverage(N);
        movingAverage.addElement(2);
        System.out.println(movingAverage.getMovingAverage()); // return 2.0 = 2 / 1

        movingAverage.addElement(10);
        System.out.println(movingAverage.getMovingAverage()); // return 6.0 = (2 + 10) / 2

        movingAverage.addElement(3);
        System.out.println(movingAverage.getMovingAverage()); // return 5.0 = (2 + 10 + 3) / 3

        movingAverage.addElement(5);
        System.out.println(movingAverage.getMovingAverage()); // return 6.0 = (10 + 3 + 5) / 3

        System.out.println("");
        movingAverage.printElements();
        System.out.println("");

        System.out.println("Elements in circular queue are");
        List<Integer> elements = movingAverage.getElements();
        for (int element : elements) {
            System.out.println(element);
        }
        System.out.println("");
    }
}
