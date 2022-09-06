package Vonglap;

import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so:");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("Khong phai so nguyen to");
        } else {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("La so nguyen to");
            } else {
                System.out.println("Khong la so nguyen to");
            }


        }
    }
}
