import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if (num%3==0 && num%5==0){
            System.out.println("num is divided by 3 and 5");
        }
        else{
            System.out.println("num is not divided by 3 and 5");
        }
        
    }
}
