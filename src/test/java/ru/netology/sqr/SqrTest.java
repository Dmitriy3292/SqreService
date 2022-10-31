package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SqrTest {


    @Test
    void sqrCounter() {

        Sqr service = new Sqr();
        int num1 = 200;
        int num2 = 300;
        int expected = 3;

        int actual = service.SqrCounter(num1, num2);
        assertEquals(expected, actual);
    }
}