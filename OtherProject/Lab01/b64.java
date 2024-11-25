import java.util.Scanner;

public class b64 {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap thang: ");
        String str=scanner.nextLine();
        int m=0;
        if (str.equals("January") || str.equals("Jan.") || str.equals("Jan") || str.equals("1")) {
            m = 1;
        } else if (str.equals("February") || str.equals("Feb.") || str.equals("Feb") || str.equals("2")) {
            m = 2;
        } else if (str.equals("March") || str.equals("Mar.") || str.equals("Mar") || str.equals("3")) {
            m = 3;
        } else if (str.equals("April") || str.equals("Apr.") || str.equals("Apr") || str.equals("4")) {
            m = 4;
        } else if (str.equals("May") || str.equals("May") || str.equals("5")) {
            m = 5;
        } else if (str.equals("June") || str.equals("Jun.") || str.equals("Jun") || str.equals("6")) {
            m = 6;
        } else if (str.equals("July") || str.equals("Jul.") || str.equals("Jul") || str.equals("7")) {
            m = 7;
        } else if (str.equals("August") || str.equals("Aug.") || str.equals("Aug") || str.equals("8")) {
            m = 8;
        } else if (str.equals("September") || str.equals("Sept.") || str.equals("Sep") || str.equals("9")) {
            m = 9;
        } else if (str.equals("October") || str.equals("Oct.") || str.equals("Oct") || str.equals("10")) {
            m = 10;
        } else if (str.equals("November") || str.equals("Nov.") || str.equals("Nov") || str.equals("11")) {
            m = 11;
        } else if (str.equals("December") || str.equals("Dec.") || str.equals("Dec") || str.equals("12")) {
            m = 12;
        }
        switch(m){
            case 2:
                System.out.println("Nhap nam: ");
                int year=scanner.nextInt();
                if (leapyear(year) == 365){
                    System.out.println("Thang nay co 28 ngay");
                } else if(leapyear(year)==366){
                    System.out.println("Thang nay co 29 ngay");
                }
                break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Thang nay co 31 ngay");
                break;
            default:
                System.out.println("Thang nay co 30 ngay");
                break;
        }
        scanner.close();
    }
    public static int leapyear(int year){
        if (year%100==0 && year%400!=0){
            return 365;
        } else if (year%100==0 && year%400==0){
            return 366;
        } else if(year%4==0){
            return 366;
        }
        return 0;
    }
}
