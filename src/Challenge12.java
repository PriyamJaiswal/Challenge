import java.util.Scanner;
public class Challenge12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication table\n");
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num) {
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i * num);
        int i = 1;
        while(i<=10){
            System.out.printf("%dX%d=%d%n", num, i, num * i);
        i++;
        }
    }

}
