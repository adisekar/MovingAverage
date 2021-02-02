package com.adisekar;

import java.util.List;

public interface IMovingAverage {
    double getMovingAverage();
    void addElement(int val);
    void printElements();
    List<Integer> getElements();
}
