import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Square = n * n;
        System.out.println(Square);
        if(Square < 5){
            System.out.print("tiny");
        }
    }
}