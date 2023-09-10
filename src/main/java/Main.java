import ru.netology.services.PackagesAndCycles;

public class Main {


    public static void main(String[] args) {
       PackagesAndCycles service = new PackagesAndCycles();

        int expected = 3;
        int actual = service.calculateMoneyMonths(10_000, 3_000,20_000);
        System.out.println("1." + expected+ "== ? ==" + actual);

        expected =2;
        actual = service.calculateMoneyMonths(100_000, 60_000,150_000);
        System.out.println("2." + expected+ "== ? ==" + actual);
    }
}
