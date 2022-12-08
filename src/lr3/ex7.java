package lr3;
import java.util.*;

public class ex7 {

    public static void main(String[] args) {

        int nums = 10;int i = 0;char[] arr = new char[10];char[] arrrev = new char[10];
        char[] alphabet ="abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (i = 0; i < (nums); i++) {

            arr[i] = (alphabet[i*2]);


        }System.out.println(Arrays.toString(arr));
        for (i =0;i<nums;i++) {
            arrrev[9-i] = arr[i];
        }
        System.out.println(Arrays.toString((arrrev)));

        }
}