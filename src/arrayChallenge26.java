public class arrayChallenge26 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting check post\n");
        int[] numArr = ArrayUtility23.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecresing(numArr);
        if(isDec || isInc){
            System.out.println("Your Array is sorted");
        }else{
            System.out.println("Your Array is not sorted");
        }
    }

    public static boolean isDecresing(int[] numArr){
        for(int i=1; i<numArr.length; i++){
            if(numArr[i] > numArr[i-1]){
                return false;
            }
        }
//        int i = 1;
//        while(i < numArr.length){
//            if(numArr[i] > numArr[i-1]){
//                return false;
//            }
//            i++;
//        }
        return true;
    }

    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

}
