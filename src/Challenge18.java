import java.util.Scanner;

public class Challenge18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime numbers");
//Prime no. = vo no. jo 1 yaa khud ke alava kisi se divide na ho
        System.out.print("please enter your number: ");
        int num = input.nextInt();
         boolean isPrime = prime(num);
         if(isPrime){
             System.out.println("Your number is prime");
         } else {
             System.out.println("Your number is not prime");
         }
    }

    public static boolean prime(int num) {
        int i = 2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
           i++;
        }
        return true;
    }


}
