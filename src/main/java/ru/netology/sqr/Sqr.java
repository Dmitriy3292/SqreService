package ru.netology.sqr;

public class Sqr {
    public int SqrCounter(int num1, int num2) {
        int count = 0;
        for (int i = 10; 10<=i && i <= 99; i++) {
            if (num1 <= i * i && i * i <= num2) {
                return i;
            }

        }
        return 0;
    }

}
