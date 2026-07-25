public class elseif1 {
    public static void main(String[] args) {
        int score=60;
        if (score<50){
            System.out.println("you need to improve");
        }
        else if(score>=50 && score<70){
            System.out.println("good");
        }
        else{
            System.out.println("excellent");
        }
    }
}
