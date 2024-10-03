import java.util.Scanner;
import java.util.SortedMap;

public class array2DChallenge31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D search\n");
        int[][] numArr = ArrayUtility23.input2DArray();
        System.out.print("Now enter the number you want to seach: ");
        int num = input.nextInt();
        boolean isFound = search(numArr, num);
        if(isFound){
            System.out.println("Your number was found");
        } else{
            System.out.println("Your number was not found");
        }

    }

    public static boolean search(int[][] numArr, int num){
        int i = 0;
        while (i < numArr.length){
            int j = 0;
            while (j < numArr[i].length){
                if(numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
