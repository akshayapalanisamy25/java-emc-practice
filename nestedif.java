import java.util.Scanner;
public class nestedif {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your salary:");
        int salary=scan.nextInt();
        System.out.println("enter your age:");
        int age=scan.nextInt();
        if(salary>=20000 || age<25){
            System.out.println("eligible for loan");
            System.out.println("enter loan amount");
            int loan=scan.nextInt();
            if(loan<50000){
                System.out.println("loan available");
            }
            else{
                System.out.println("loan is greater");

            }
        }
        else{
            System.out.println("not eligible");
        }
        
    }
}
