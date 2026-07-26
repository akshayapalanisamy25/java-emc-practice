import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int var1=scan.nextInt();
        int var2=scan.nextInt();
        String result=var1>var2?"true":"false";
        System.out.println(result);
        
    }
}
