import java.util.Scanner;
public class Challenge7  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the leap year");
        System.out.print("Please enter your year: ");
        int year = input.nextInt();

//        if(year % 400 == 0){
//            System.out.println("Your year is leap year");
//        } else if(year % 100 == 0){
//            System.out.println("Your year is not leap year");
//        } else if(year % 4 == 0){
//            System.out.println("Your year is leap year");
//        } else {
//            System.out.println("Your year is not leap year");
//        }
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )) {
            System.out.println("Your year is leap year");
        } else {
            System.out.println("Your year is not leap year");
        }
    }
}
