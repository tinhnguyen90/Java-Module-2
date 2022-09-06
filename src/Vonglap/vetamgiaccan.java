package Vonglap;

public class vetamgiaccan {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int demrong = 5 - i;
            for (int j = 1; j <= demrong; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
