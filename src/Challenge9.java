import java.util.Scanner;
public class Challenge9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND operation");
        System.out.println("Showcasing Bitwise OR operation");
        System.out.println("Showcasing Bitwise XOR operation");
        System.out.println("Showcase of NOT/Compliment operation");

        System.out.print("Please enter first number");
        int first = input.nextInt();
        System.out.print("Now, Please enter second number");
        int second = input.nextInt();

        int result1 = first & second;  // AND operation
        int result2 = first | second;  // OR operation
        int result3 = first ^ second;  // XOR operation
        int result4 = ~first;          // NOT operation

        System.out.println("Result is: " + result1);
        System.out.println("Result is: " + result2);
        System.out.println("Result is: " + result3);
        System.out.println("Result is: " + result4);

    }
}
