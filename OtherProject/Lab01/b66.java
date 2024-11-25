import java.util.Scanner;

public class b66 {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Nhap n: ");
         int n=scanner.nextInt();
         System.out.println("Nhap m: ");
         int m=scanner.nextInt();
         int[][] matrix1=new int[n][m];
         int[][] matrix2=new int[n][m];
         int[][] matrix3=new int[n][m];
         System.out.println("Nhap cac phan tu matrix1: ");
         for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                int a=scanner.nextInt();
                matrix1[i][j]=a;
            }
         }
         System.out.println("Nhap cac phan tu matrix2: ");
         for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                int a=scanner.nextInt();
                matrix2[i][j]=a;
            }
         }
         System.out.printf("Cong 2 ma tran: \n");
         for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.printf("%d ", matrix3[i][j]);
            }
            System.out.println("\n");
         }
         scanner.close();
    }
}