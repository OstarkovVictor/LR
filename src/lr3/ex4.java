package lr3;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Input first number: ");
        int num1 = in.nextInt();
        System.out.println("Input second number: ");
        int num2 = in.nextInt();
        int out_num;
        int i = 0;
        int rev;
        if (num1 > num2) {
            rev = 1;
            out_num = num2 - 1;
        } else {
            rev = -1;
            out_num = num1 - 1;
        }

        while (i != (rev * (num1 - num2))+1) {


            System.out.print(out_num + 1 +" ");
            i += 1; out_num +=1;
        }
    }
}