package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @Test
    void shouldSqrtCeil() {
        SQRService service = new SQRService();
        int num1 = 500;
        int num2 = 800;
        int expected = 6;

        int actual = service.checkNumber(num1, num2);

        assertEquals(expected, actual);
    }

}