import java.util.Scanner;

public class Tinhcannang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Can nang: ");
        weight = scanner.nextDouble();

        System.out.println("Chieu cao:");
        height = scanner.nextDouble();
        bmi = weight/ Math.pow(height,2);
        System.out.print("bmi = ");
        if (bmi < 18)
            System.out.printf(bmi+ " Underweight");
        else if (bmi < 25.0)
            System.out.printf(bmi+ " Normal");
        else if (bmi < 30.0)
            System.out.printf(bmi+ " Overweight");
        else
            System.out.printf(bmi+ " Obese");
    }
}


