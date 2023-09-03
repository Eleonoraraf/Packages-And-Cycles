package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.PackagesAndCycles;

public class PackagesAndCyclesTest {
    @Test
    public void shouldCalculateMoneyMonths1() {
        PackagesAndCycles service = new PackagesAndCycles();

        int expected = 3;
        int actual = service.calculateMoneyMonths(10_000, 3_000, 20_000);
        //System.out.println("1." + expected+ "== ? ==" + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMoneyMonths2() {
        PackagesAndCycles service = new PackagesAndCycles();

        int expected = 2;
        int actual = service.calculateMoneyMonths(100_000, 60_000, 150_000);
        //System.out.println("2." + expected+ "== ? ==" + actual);
        Assertions.assertEquals(expected, actual);
    }
}
