import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        Integer first = sc.nextInt();
        System.out.println("Enter the second number: ");
        Integer second = sc.nextInt();
        int sum = 0;
        sum = first + second;
        System.out.printf("The sum is: %d unit", sum);
    }
}
