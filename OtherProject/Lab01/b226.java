import java.util.Scanner;

public class b226 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng chọn: ");
        System.out.println("1. Phương trình thuần nhất bậc 1: ");
        System.out.println("2. Hệ phương trình thuần nhất 2 ẩn: ");
        System.out.println("3. Phương trình thuần nhất bậc 2: ");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
                choice1(scanner);
                break;
            case 2:
                choice2(scanner);
                break;
            case 3:
                choice3(scanner);
                break;
        }
    }
    public static void choice1(Scanner scanner) {
        System.out.printf("Nhập a: ");
        double a=scanner.nextDouble();
        System.out.printf("Nhập b: ");
        double b=scanner.nextDouble();
        if (a==0 && b!=0){
            System.out.printf("Phương trình đã cho vô nghiệm!");
        } else if (a==0 && b==0){
            System.out.printf("Phương trình đã cho vô số nghiệm!\n");
        } else {
            System.out.printf("Phương trình đã cho có duy nhất 1 nghiệm x=%.2f!,\n",-b/a);
        } 
        }
    public static void choice2(Scanner scanner){
        System.out.printf("Nhập a11: ");
        double a11=scanner.nextDouble();
        System.out.printf("Nhập a12: ");
        double a12=scanner.nextDouble();
        System.out.printf("Nhập b1: ");
        double b1=scanner.nextDouble();
        System.out.printf("Nhập a21: ");
        double a21=scanner.nextDouble();
        System.out.printf("Nhập a22: ");
        double a22=scanner.nextDouble();
        System.out.printf("Nhập b2: ");
        double b2=scanner.nextDouble();
        double D=Math.abs(a11*a22-a21*a12);
        double D1=Math.abs(b1*a22-b2*a12);
        double D2=Math.abs(a11+b2-a21*b1);
        if (D!=0){
            System.out.printf("Hệ phương trình có nghiệm duy nhất: (x1,x2)=(%.2f,%.2f)",D1/D,D2/D);
        } else if(D1==0 && D2==0){
            System.out.printf("Hệ có vô số nghiệm!");
        } else {
            System.out.printf("Hệ vô nghiệm!");
        }
    }
    public static void choice3(Scanner scanner){
        System.out.printf("Nhập a(khác 0): ");
        double a=scanner.nextDouble();
        System.out.printf("Nhập b: ");
        double b=scanner.nextDouble();
        System.out.printf("Nhập c: ");
        double c=scanner.nextDouble();
        double denta=b*b-4*a*c;
        if (denta<0){
            System.out.printf("Phương trình vô nghiệm!");
        } else if (denta==0){
            System.out.printf("Phương trình có nghiệm kép: x1=x2=%.2f", -b/(2*a));
        } else{
            System.out.printf("Phương trình có hai nghiệm phân biệt: x1=%.2f và x2=%.2f",(-b-Math.sqrt(denta))/(2*a),(-b+Math.sqrt(denta))/(2*a)) ;
        }
    }
}

