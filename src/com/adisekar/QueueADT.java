package com.adisekar;

public class QueueADT {
    private int[] arr;
    private int frontPtr;
    private int rearPtr;
    private int size;

    // Insertion is done at rear end and deletion is done at front end
    public QueueADT(int size) {
        this.arr = new int[size + 1];
        this.frontPtr = 0;
        this.rearPtr = 0;
        this.size = size + 1;
    }

    public int getArrValueAtIndex(int index) {
        return arr[index];
    }
    public void setArrValueAtIndex(int val, int index) {
        this.arr[index] = val;
    }

    public int getFrontPtr() {
        return frontPtr;
    }

    public void setFrontPtr(int frontPtr) {
        this.frontPtr = frontPtr;
    }

    public int getRearPtr() {
        return rearPtr;
    }

    public void setRearPtr(int rearPtr) {
        this.rearPtr = rearPtr;
    }

    public int getSize() {
        return size;
    }

    // Rear should always not be equal to front. If it is equal, queue is empty
    // Use mod array size, to make sure indices are within boundaries, when moving back to start of array
    public boolean IsFull()
    {
        if ((this.rearPtr + 1) % this.size == this.frontPtr)
        {
            return true;
        }
        return false;
    }

    public boolean IsEmpty()
    {
        if (this.rearPtr == this.frontPtr)
        {
            return true;
        }
        return false;
    }
}
