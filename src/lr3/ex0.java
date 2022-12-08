package lr3;
import java.util.*;

public class ex0 {

    public static void main(String[] args) {
        int size = 100;int i = 0;
        int[] a = new int[size];
        int[] a1 = new int[size];
        Random ran = new Random();
        for (i =0; i < size; i++) {
            a[i] = ran.nextInt(100);



        }
        Arrays.sort(a);
        i = 0;

        for (i =0;i<size;i++) {
            a1[size-1-i] = a[i];
        }
        System.out.println(Arrays.toString((a1)));



    }


}