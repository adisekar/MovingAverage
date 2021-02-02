package com.adisekar;

import java.util.List;

public class MovingAverage implements IMovingAverage {
    private CircularQueue queue;
    private int count;
    private double average;
    private double total;
    private int maxSize;

    public MovingAverage(int size) {
        queue = new CircularQueue(size);
        count = 0;
        average = 0;
        total = 0;
        maxSize = size;
    }

    @Override
    public double getMovingAverage() {
        return average;
    }

    @Override
    public void addElement(int val) {
        if (count == maxSize) {
            int removedNum = queue.dequeue();
            total -= removedNum;
        }
        queue.enqueue(val);
        // If count is max size, do not increment anymore
        count = count == maxSize ? maxSize : count + 1;
        total = total + val;
        average = (double) total / count;
    }

    @Override
    public List<Integer> getElements() {
        return queue.getElements();
    }

    @Override
    public void printElements() {
        System.out.println("Items in circular queue are");
        queue.printItems();
    }
}
