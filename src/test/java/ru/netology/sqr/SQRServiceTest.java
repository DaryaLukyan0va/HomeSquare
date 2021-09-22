package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void checkExampleHomeSquare() {
        SQRService sqrService = new SQRService();
        int actual = sqrService.homeSquare(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void checkExampleChangeHomeSquare() {
        SQRService sqrService = new SQRService();
        int actual = sqrService.homeSquare(200, 400);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void checkSmallNumberHomeSquare() {
        SQRService sqrService = new SQRService();
        int actual = sqrService.homeSquare(10, 90);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void checkBigNumberHomeSquare() {
        SQRService sqrService = new SQRService();
        int actual = sqrService.homeSquare(100_000, 2_000_000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void checkAverageNumberHomeSquare() {
        SQRService sqrService = new SQRService();
        int actual = sqrService.homeSquare(100, 2000);
        int expected = 35;
        assertEquals(expected, actual);
    }
}