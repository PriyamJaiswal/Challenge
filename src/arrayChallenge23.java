public class arrayChallenge23 {

     public static void main(String[] args) {
          System.out.println("Welcome to Array sum and Average");
          int[] numArray = ArrayUtility23.inputArray();
          long sum = sum(numArray);
          double avg = average(numArray);
          System.out.println("Sum of the numbers is: " + sum);
          System.out.println("Average of the numbers is: " + avg);
     }

     public static long sum(int[] numArray) {
          long sum = 0;
          int i=0;
          while(i < numArray.length){
               sum+= numArray[i];
               i++;
          }
          return sum;
     }

//     public static int average(int[] numArray) {
//          long sum = sum(numArray);
//          return (int) (sum / numArray.length);
//          //(int) eska matlab hai ki hum long ko int me adjest kr rhe hai

      //    if ham answer decimal me lena chahe to long ke place per double use karenge
          public static double average(int[] numArray) {
               double sum = sum(numArray);
               return  (sum / numArray.length);
     }

}
