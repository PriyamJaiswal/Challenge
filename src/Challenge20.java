import java.util.Scanner;
public class Challenge20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to fibonacci series");
        System.out.print("please enter the number upto which series has to be printed: ");
        int num = input.nextInt();
        System.out.print("Fibonacci series: ");
        fibonacci(num);
    }

    public static void fibonacci(int num){
        if(num < 0) return;
        System.out.print("0 ");
         if(num == 0)return;
        System.out.print("1 ");

       int first = 0, second = 1;
       while(first + second <= num){
           int third = first + second;
           System.out.print(third + " ");
           first = second;
           second = third;
        }

    }
}
