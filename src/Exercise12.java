public class Exercise12 {
    public static void main(String[] args) {
        int[] arr ={54,52,87,1,83,76,12,76,12,98,12,6};
        int num = 50;
        int[] printArray1 = smallEqualBig(arr,num);
        for(int i = 0; i < printArray1.length; i++){
            System.out.print(printArray1[i] + ", ");
        }
    }
    public static int[] smallEqualBig(int[] arr, int num){
        final int ARRAY_SIZE = 3;
        int[] returnArray = new int[ARRAY_SIZE];
        int smallerNumber = 0;
        int equalNumber = 0;
        int biggerNumber = 0;
        int j = 0;
        while(j<ARRAY_SIZE) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < num) {
                    smallerNumber++;
                } else if (arr[i] == num) {
                    equalNumber++;
                } else {
                    biggerNumber++;
                }
            }
            returnArray[j] = smallerNumber;
            j++;
            returnArray[j] = equalNumber;
            j++;
            returnArray[j] = biggerNumber;
            j++;
        }
        return returnArray;
    }
}
