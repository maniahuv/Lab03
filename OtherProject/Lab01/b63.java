import java.util.Scanner;

public class b63{
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n=scanner.nextInt();
        int m=2*n-1;
        for (int y=0;y<n;y++){
            for (int x=0;x<m;x++){
                if (x<=n-1 && (y+x-(n-1))>=0 ){
                    System.out.print("*");
                } else if (x>=n-1 && (y-x+n-1)>=0){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}