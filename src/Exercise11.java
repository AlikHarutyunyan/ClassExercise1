public class Exercise11 {
    public static void main(String[] args) {
        int x = 2;
        int[] arr = {2, 5, 16, 12, 3, 9, 1, 2, 8, 3};
        System.out.println(sumOfDistances(arr, x));
    }

    public static int sumOfDistances(int[] arr, int x) {
        final int NOT_FOUND = -1;
        int firstLeftIndex = -1;
        int lastRightIndex = -1;
        int result = -1;
        int rightDistance;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastRightIndex = i;
                if (firstLeftIndex == -1) {
                    firstLeftIndex = i;
                }
            }
        }
        if (firstLeftIndex != -1) {
            rightDistance = (lastRightIndex - (arr.length - 1)) * -1;
            result = rightDistance + firstLeftIndex;
        }
        return result;
    }
}
