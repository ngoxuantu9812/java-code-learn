import java.util.Scanner;

public class ComplexNumber {

    double real, img;

    ComplexNumber(double r, double i){
        this.real = r;
        this.img = i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần thực số a");


        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);
        ComplexNumber ComplexNumberResult = sum(a, b);
        System.out.printf("Kết quả là: "+ ComplexNumberResult.real+" + "+ ComplexNumberResult.img +"i");
    }

    public static ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.real + b.real, a.img + b.img);
    }


}
