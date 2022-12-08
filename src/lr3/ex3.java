package lr3;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Input number: ");
        int nums = in.nextInt();
        int num = 1;
        int num1 = 1;
        for (int i = 0; i < (nums/2); i++) {System.out.print(num1 +" ");
            num +=num1;
            System.out.print(num +" ");

            num1 += num;

        }
    }
}