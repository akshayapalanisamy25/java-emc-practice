import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        int f=d/e;
        System.out.println("multiply"+d);
        System.out.println("add"+e);
        System.out.println("divide"+f);
    }
    
}
