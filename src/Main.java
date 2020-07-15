import java.util.Scanner;

/**
 * Created by KPS on 7/15/2020.
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();
        double result = b * b - 4.0 * a * c;
        if (result>0){
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if(result==0){
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else{
            System.out.println("no answer");
        }

    }
}
