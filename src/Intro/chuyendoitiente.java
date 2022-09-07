import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.println("Nhap so tien USD: ");
        usd = scanner.nextDouble();
        double quydoi =usd*23000;
        System.out.println("Gia VND ="+quydoi);

    }
}
