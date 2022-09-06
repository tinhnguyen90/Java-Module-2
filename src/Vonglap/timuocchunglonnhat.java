package Vonglap;

import java.util.Scanner;

public class timuocchunglonnhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);

        System.out.println("nhap so a");
        a = input.nextInt();

        System.out.println("nhap so b");
        b = input.nextInt();

        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                if (b % i == 0) {
                    System.out.println("uoc chung lon nhat la: " + i);
                    break;
                }
            }
        }
    }
}
