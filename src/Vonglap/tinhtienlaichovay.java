package Vonglap;

import java.util.Scanner;

public class tinhtienlaichovay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.println("Nhap so tien dau tu");
        money = input.nextDouble();

        System.out.println("Nhap so thang");
        month = input.nextInt();

        System.out.println("Nhap lai xuat hang nam theo ti le nam");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for( int i =0; i< month; i++);
        totalInterest += money * (interestRate/100)/12 * month;
        System.out.println("Tong tien lai: " + totalInterest);
    }
}
