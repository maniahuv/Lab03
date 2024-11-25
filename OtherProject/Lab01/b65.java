import java.util.Scanner;
public class b65 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            int a=scanner.nextInt();
            arr[i]=a;
            sum+=a;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i]<arr[j]){
                    int c=arr[j];
                    arr[j]=arr[i];
                    arr[i]=c;
                }
            }
        }
        double ave=(double)sum/n;
        System.out.printf("Sum: %d\nAverage: %.2f\n", sum, ave);
        System.out.print("Newarray: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
