import java.util.Scanner;
public class Challenge10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the leftRight shifting\n");
        System.out.print("Please enter your number ");
        int num = input.nextInt();

        int result1 = num << 1;
        int result2 = num >> 1;

        System.out.println(result1);
        System.out.println(result2);
    }
}
