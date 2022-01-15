package ru.netology.sqr;

public class SQRService {

    public int sqrNumber(int downEdge, int upEdge) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= downEdge &&
                    i * i <= upEdge) {
                counter++;
            }
        }
        return counter;
    }
}

