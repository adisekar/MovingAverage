package com.adisekar;

import java.util.ArrayList;
import java.util.List;

public class CircularQueue {
    private QueueADT queue;

    public CircularQueue(int size) {
        queue = new QueueADT(size);
    }

    public List<Integer> getElements(){
        List<Integer> elements = new ArrayList<>();
        int i = (queue.getFrontPtr() + 1) % queue.getSize();
        while (i != (queue.getRearPtr() + 1) % queue.getSize()) {
            elements.add(queue.getArrValueAtIndex(i));
            i = (i + 1) % queue.getSize();
        }
        return elements;
    }

    public void enqueue(int num) {
        if (!queue.IsFull()) {
            queue.setRearPtr((queue.getRearPtr() + 1) % queue.getSize());
            queue.setArrValueAtIndex(num, queue.getRearPtr());
        } else // queue is full. Now dequeue and add items.
        {
            dequeue();
            enqueue(num);
        }
    }

    public int dequeue() {
        int x = -1;
        if (!queue.IsEmpty()) {
            queue.setFrontPtr((queue.getFrontPtr() + 1) % queue.getSize());
            x = queue.getArrValueAtIndex(queue.getFrontPtr());
        } else {
            System.out.println("Queue is empty");
        }
        return x;
    }

    public void printItems() {
        int i = (queue.getFrontPtr() + 1) % queue.getSize();
        while (i != (queue.getRearPtr() + 1) % queue.getSize()) {
            System.out.println(queue.getArrValueAtIndex(i));
            i = (i + 1) % queue.getSize();
        }
    }
}
