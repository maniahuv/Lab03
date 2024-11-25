import java.util.Scanner;
public class b225{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1=scanner.nextDouble();
        double num2=scanner.nextDouble();
        System.out.printf("Sum: %.2f\n", num1+num2);
        System.out.printf("Difference: %.2f\n", num1-num2);
        System.out.printf("Product: %.2f\n", num1*num2);
        System.out.printf("Quotient: %.2f", num1/num2);
        scanner.close();
    }
}