import java.util.Scanner;
public class Challenge13 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Odd sum\n");
            System.out.print("please enter your number: ");
            int num = input.nextInt();
            int sum = oddSum(num);
        System.out.println("OddSum till "+ num + " is: "+ sum);
        }

    public static int oddSum(int num) {
        int sum = 0;
//        int i = 1;
       for(int i=1; i<=num; i+=2){ sum +=i;}
//        while (i<= num){
//            sum = sum + i;
//            i+=2;
//        }

      return sum;

    }
    }

