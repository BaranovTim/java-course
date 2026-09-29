package ru.netology.service;

public class second_hw2 {
    public static final int calcs(int price, int weight) {
        int customs = 0;
        int rounded = (int) Math.round(price * 0.01);
        customs = customs + rounded;
        customs = customs + weight * 100;
        return customs;
    }

}