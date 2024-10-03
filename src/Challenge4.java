import java.util.*;
public class Challenge4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple interest calculater\n");
        System.out.println("And, Welcome to Compound interest calculater\n");

        System.out.print("Please enter your principle amount Rs: ");
        int principle = input.nextInt();
        System.out.print("Now, Tell me your rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Now, Tell me for how many years are you borrowing this money: ");
        float years = input.nextFloat();

        float interest = (principle * rate * years) / 100;
        System.out.println("\n\n Your simple interest is Rs: " + interest);

        double compInt = principle * Math.pow((1 + rate/100), years);
        System.out.println("Your compound interest is Rs: " + compInt);

    }
}
