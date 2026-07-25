import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int tam=scan.nextInt();
        int eng=scan.nextInt();
        int mat=scan.nextInt();
        int sci=scan.nextInt();
        int social=scan.nextInt();
        int add=tam+eng+mat+sci+social;
        int average=add/5;
        if(average<35){
            System.out.println("Additional class is required");
        }
        else{
            System.out.println("you are good to go");
        }
    }
    
}
