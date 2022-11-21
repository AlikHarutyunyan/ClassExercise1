public class Exercise10 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,44,2};
        int num = 10;
        System.out.println(returnIndex(arr,num));
    }

    public static int returnIndex(int[] arr, int num){
        int sumOfValues = 0;
        int result = -1;
        for(int i =0; i<arr.length; i++){
            sumOfValues += arr[i];
            if(sumOfValues >= num){
                result = i;
                break;
            }
        }
        return result;
    }
}
