import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double avg = sc.nextDouble();
        if(avg >= 1.0){
            System.out.println("High");
        }
        else if(avg >= 0.5 && avg < 1.0){
            System.out.println("Middle");
        }
        else{
            System.out.println("Low");
        }
    }
}