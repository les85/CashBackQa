package ru.netology.service;
import static org.testng.Assert.assertEquals;

public class CashBackHackServiceTest {


    @org.testng.annotations.Test
    public void testRemain() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainWhithCashBack() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainZero() {
        CashBackHackService service = new CashBackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainMultipleBoundary() {
        CashBackHackService service = new CashBackHackService();

        int amount = 3000;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainHalfBoundary() {
        CashBackHackService service = new CashBackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}