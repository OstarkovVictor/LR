package lr3;
import java.util.Scanner;
import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        int out_num = 1;
        int i =0;
        int rev =0;




        for (int i1 = 0; i1 < size; i1++) {

            out_num = (i1) * 5 + 2;

            arr[i1] = out_num;





        }
        System.out.print(Arrays.toString(arr));
    }
}