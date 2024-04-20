package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashBackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testRemainWhithCashBack() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testRemainZero() {
        CashBackHackService service = new CashBackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testRemainMultipleBoundary() {
        CashBackHackService service = new CashBackHackService();

        int amount = 3000;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainHalfBoundary() {
        CashBackHackService service = new CashBackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}
