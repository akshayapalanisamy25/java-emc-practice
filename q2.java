import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Mark=scan.nextInt();
        if (Mark>35){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
