import java.util.Scanner;

public class Giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x+b=c', please enter constants:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        Double a = scanner.nextDouble();

        System.out.println("b:");
        Double b = scanner.nextDouble();

        System.out.println("c:");
        Double c = scanner.nextDouble();
        if(a !=0){
            double answer = (c-b)/a;
            System.out.println("Equation pass width x = "+ answer);
        }else {
            if(b==c){
                System.out.println("The solution is all x!");
            }else{
                System.out.println("No solution");
            }
        }

    }
}
