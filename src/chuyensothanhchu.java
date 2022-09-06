import java.util.Scanner;

public class chuyensothanhchu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, a, b, c;
        System.out.println("Nhập số cần đọc");
        number = sc.nextInt();
        a = number / 100;
        b = (number % 100) / 10;
        c = (number % 100) % 10;
        switch (a) {
            case 0:
                if (a == 0) {
                    System.out.println("");
                    break;
                }
            case 1:
                System.out.print("One hundred");
                break;
            case 2:
                System.out.print("two hundred");
                break;
            case 3:
                System.out.print("three hundred");
                break;
            case 4:
                System.out.print("four hundred");
                break;
            case 5:
                System.out.print("five hundred");
                break;
            case 6:
                System.out.print("six hundred");
                break;
            case 7:
                System.out.print("seven hundred");
                break;
            case 8:
                System.out.print("eight hundred");
                break;
            case 9:
                System.out.print("nine hundred");
                break;
        }
        switch (b) {
            case 1:
                System.out.print("\t");
                break;
            case 2:
                System.out.print("\t twenty");
                break;
            case 3:
                System.out.print("\tthirty");
                break;
            case 4:
                System.out.print("\tforty");
                break;
            case 5:
                System.out.print("\tfifty");
                break;
            case 6:
                System.out.print("\tsixty");
                break;
            case 7:
                System.out.print("\tseventy");
                break;
            case 8:
                System.out.print("\teighty");
                break;
            case 9:
                System.out.print("\tninety");
                break;
        }
        if (b == 1) {
            switch (c) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.print("\televen");
                    break;
                case 2:
                    System.out.print("\t twelve");
                    break;
                case 3:
                    System.out.print("\tthirteen");
                    break;
                case 4:
                    System.out.print("\tfourteen");
                    break;
                case 5:
                    System.out.print("\tfifteen");
                    break;
                case 6:
                    System.out.print("\tsixteen");
                    break;
                case 7:
                    System.out.print("\tseventeen");
                    break;
                case 8:
                    System.out.print("\teighteen");
                    break;
                case 9:
                    System.out.print("\tnineteen");
                    break;

            }

        } else {
            switch (c){
                case 1:
                    System.out.print("\tone");
                    break;
                case 2:
                    System.out.print("\t two");
                    break;
                case 3:
                    System.out.print("\tthree");
                    break;
                case 4:
                    System.out.print("\tfour");
                    break;
                case 5:
                    System.out.print("\tfive");
                    break;
                case 6:
                    System.out.print("\tsix");
                    break;
                case 7:
                    System.out.print("\tseven");
                    break;
                case 8:
                    System.out.print("\teight");
                    break;
                case 9:
                    System.out.print("\tnine");
                    break;

            }

        }
    }
}