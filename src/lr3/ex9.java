package lr3;
import java.util.*;

public class ex9 {

    public static void main(String[] args) {
        int size = 100;int i = 0;
        int[] a = new int[size];
        Random ran = new Random();
        for (i =0; i < size; i++) {
            a[i] = ran.nextInt(100);



        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println((a[0])+" index: "+ 0);
        i = 0;

        for (i = 0;i<size;i++){
            if (a[i] == a[i+1]){
                System.out.println((a[i+1]) +" index: "+ (i+1));
            }else break;
        }



    }


}