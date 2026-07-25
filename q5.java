import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String color=scan.nextLine();
        if(color.equals("red")){
            System.out.println("stop");
        }
        else if(color.equals("orange")){
            System.out.println("get ready");
        }
        else{
            System.out.print("go");
        }
        
    }
}
