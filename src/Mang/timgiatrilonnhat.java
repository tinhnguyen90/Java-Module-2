package Mang;

import java.util.Scanner;

public class timgiatrilonnhat {
    public static void main(String[] args) {
        int n;
        int []soNguyen;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu mang:");
        n = sc.nextInt();
        soNguyen = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Nhap cac phan tu:");
            soNguyen[i]= sc.nextInt();

        }for(int i=0; i<n;i++){
            if(soNguyen[i]>max){
                max= soNguyen[i];
            }
        }
        System.out.println("So lon nhat la "+max);
    }
}

