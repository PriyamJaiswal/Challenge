import java.util.Scanner;

public class Challenge21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong number");
   /* 132 ka Arm.. No. = 1^3 + 3^3 + 2^3 = 36   jitni number ki digit hogi pow. bhi utna hi hoga */
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("Your number is not Armstrong");
        }
    }

    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while(num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        return finalNumber == numCopy;
    }

    public static int pow(int num1,int num2){
        int result = num1;
        int i = 1;
        while (i < num2){
            result *= num1;
            i++;
        }
       return result;
    }


    public static int noOfDigits(int num){
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }


}
