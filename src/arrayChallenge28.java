class arrayChallenge28 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal\n");
        int[] numArr = ArrayUtility23.inputArray();
         reverse(numArr);
        System.out.println("Your reversed array is");
        ArrayUtility23.displayArray(numArr);
    }

    public static void reverse(int[] arr){
        int i =0;
        while(i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[arr.length - i - 1];
//            yaa
//            arr[i] = arr[(arr.length - 1) - i];
            arr[arr.length - i - 1] = swap;
            i++;
        }

    }
}
