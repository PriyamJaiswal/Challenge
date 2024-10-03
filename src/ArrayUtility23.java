import java.util.*;

public class ArrayUtility23 {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of element: ");
        int size = input.nextInt();
        int[] nums = new int[size];
//          for(int i=0; i<size; i++){
//               System.out.print("Please enter element no. " + (i+1) + ":");
//               nums[i] = input.nextInt();
//          }
        int i=0;
        while(i < size){
            System.out.print("Please enter element no. " + (i+1) + ":");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = input.nextInt();
        int[][] numArray = new int[rows][columns];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while(j < columns) {
                System.out.print("Please enter element rows: "+ (i+1) +  ", column: " + (i + 1) + ":");
               numArray[i][j]= input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

    public static void displayArray(int[] numArray){
        int i  = 0;
        while(i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
