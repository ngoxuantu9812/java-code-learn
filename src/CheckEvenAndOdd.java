import java.util.Scanner;

public class CheckEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số:");
        Integer number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        }else System.out.println("Odd");
    }
}
