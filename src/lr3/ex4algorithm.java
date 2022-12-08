package lr3;
import java.util.Scanner;

public class ex4algorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Input number: ");
        int num1 = in.nextInt();
        System.out.println("Input number: ");
        int num2 = in.nextInt();
        int out_num;

        int rev;
        if (num1 > num2) {
            rev = 1;
            out_num = num2 - 1;
        } else {
            rev = -1;
            out_num = num1 - 1;
        }

        for (int i = 0; i < ((rev * (num1 - num2)) + 1); i++) {


            System.out.print(out_num + 1 + " ");
            out_num += 1;
        }
    }
}