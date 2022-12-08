package lr3;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Input number: ");
        int num = in.nextInt();
        int out_num = 0;
        int i =0;
        int rev =0;


        for (int i1 = 0; i1 < num; i1++) {


            do{
                out_num = (i + 1) * 5 + (2);

                i +=1;
            }while ((out_num % 3) != 1);
            rev += out_num;
                System.out.print(out_num + " ");




        }
        System.out.print("sum: " + rev);
    }
}