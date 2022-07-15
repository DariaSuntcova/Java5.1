package ru.netology.javaqa.javaqamvn.sqr;

public class SQRService {
    public int calcSQRAreInRange(int x, int y) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (x <= (i * i) & (i * i) <= y) {
                count++;
            }
        }
        return count;
    }
}

