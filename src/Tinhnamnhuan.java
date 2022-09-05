import java.util.Scanner;

public class Tinhnamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a Year: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isdiVisibleBy4 = year%4==0;
        if(isdiVisibleBy4){
            boolean isdiVisibleBy100 = year%100==0;
            if(isdiVisibleBy100){
                boolean isdiVisibleBy400 = year%400==0;
                if(isdiVisibleBy400){
                    isLeapYear = true;

                }
            }else {
                isLeapYear = true;

            }
        }
        if(isLeapYear){
            System.out.printf(" %d is a leap year", year);
        }else{
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
