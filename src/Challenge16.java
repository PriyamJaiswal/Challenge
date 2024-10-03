import java.util.Scanner;
public class Challenge16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Least Common Multiple(LCM)");
        System.out.print("please enter your number: ");
        int first = input.nextInt();
        System.out.print("Please enter your number: ");
        int second = input.nextInt();
        int lcm = lcm(first,second);
        System.out.println("LCM of the two numbers is: " + lcm);
    }

    public static int lcm(int first, int second) {
   //    int i = 1;
//       while (i <= second){
//           int factor = first * i;
//           if (factor % second == 0){
//               return factor;
//           }
//           i++;
//       }
//       return 0;

    //  es condition me compiler braiket ke bahar return missing nhi dikhayega
     int i = 1;
        while (true){
            int factor = first * i;
            if (factor % second == 0){
                return factor;
            }
            i++;
        }

// for statement
// es condition me compiler ko last me return 0 dena pdhega
//        for(int i=1; i<=second; i++){
//            int factor = first * i;
//            if (factor % second == 0){
//                return factor;
//            }
//        }
//        return 0;
    }
}
