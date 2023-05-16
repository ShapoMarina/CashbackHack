package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCountCashBack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountCashBackForOneHundred() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountCashBackForNineHundred() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountCashBackForAmountOverThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;
        int expected =700;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountCashBackForOneThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected =0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

}