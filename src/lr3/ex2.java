package lr3;
import java.util.Scanner;

public class ex2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Input number between 1 to 7: ");
        String week = in.nextLine();
        int num= 0;

        switch (week) {
            case "monday" : System.out.println("It's 1st");
                break;
            case "tuesday" :System.out.println("It's 2nd");
                break;
            case  "wednesday" : System.out.println("It's 3rd");
                break;
            case "thursday" : System.out.println("It's 4th");
                break;
            case "friday" :System.out.println("It's 5th");
                break;
            case "saturday" : System.out.println("It's 6th");

                break;
            case "sunday" :System.out.println("It's 7th");

                break;
            default:System.out.println("Incorrect day");
                break;
        }


        in.close();

    }
}



