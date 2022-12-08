package lr3;
import java.util.Scanner;

public class ex1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Input number between 1 to 7: ");
        int num = in.nextInt();
        String week = "";

        switch (num) {
            case 1: System.out.println("It's monday");
                break;
            case 2:System.out.println("It's tuesday");
                break;
            case 3: System.out.println("It's wednesday");
                break;
            case 4: System.out.println("It's thursday");
                break;
            case 5:System.out.println("It's friday");
                break;
            case 6: System.out.println("It's saturday");

                break;
            case 7:System.out.println("It's sunday");

                break;
            default:System.out.println("Incorrect number");
                break;
        }


        in.close();

    }
}




