import java.util.Random;

public class Exercise9 {
    public static void main(String[] args){
        //26
        int[] printArray1 = returnArray(5,3);
        System.out.println("26) returnArray output is: ");
        for(int i = 0; i < printArray1.length; i++){
            System.out.print(printArray1[i] + ", ");
        }
        //27
        int[] printArray2 = returnArrayInOrder(5,3);
        System.out.println("\n27) returnArrayInOrder output is: ");
        for(int i = 0; i < printArray2.length; i++){
            System.out.print(printArray2[i] + ", ");
        }
        //28
        int[] myArray = returnRandomArray(5);
        System.out.println("\n28) returnRandomArray output is: ");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + ", ");
        }
        //29
        System.out.println("\n29) Biggest number in returnRandomArray output is: \n" + returnBiggestNumber(myArray));

        //30
        int[] test = {1,2,3,1,2,1};
        System.out.println("\nArray test is: ");
        for(int i = 0; i<test.length; i++){
            System.out.print(test[i] + ", ");
        }
        System.out.println("\n30) The number 1 is in the test array " + checkNumberInArray(test, 1) + " times");

        //31
        int[] printArray3 = removeNumberFromArray(test,1);
        System.out.println("31) removeNumberFromArray in the test array output is: ");
        for(int i = 0; i < printArray3.length; i++){
            System.out.print(printArray3[i] + ", ");
        }
    }


    //26
    public static int[] returnArray(final int ARRAY_LENGTH, int arrayValue){
        int[] arr = new int[ARRAY_LENGTH];
        for(int i = 0; i < ARRAY_LENGTH; i++){
            arr[i] = arrayValue;
        }
        return arr;
    }

    // 27
    public static int[] returnArrayInOrder(final int ARRAY_LENGTH, int firstValue){
        int[] arr = new int[ARRAY_LENGTH];
        for(int i = 0; i < ARRAY_LENGTH; i++){
            arr[i] = firstValue;
            firstValue++;
        }
        return arr;
    }

    //28
    public static int[] returnRandomArray(final int ARRAY_LENGTH){
        Random random = new Random();
        int[] arr = new int[ARRAY_LENGTH];
        for(int i = 0; i < ARRAY_LENGTH; i++){
            arr[i] = random.nextInt();
        }
        return arr;
    }

    //29
    public static int returnBiggestNumber(int[] firstValue){
        int currentNumber = firstValue[0];
        for(int i = 0; i < firstValue.length; i++){
            if(firstValue[i] > currentNumber){
                currentNumber = firstValue[i];
            }
        }
        return currentNumber;
    }

    //30
    public static int checkNumberInArray(int[] arr, int num){
        int numberCount = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                numberCount++;
            }
        }
        return numberCount;
    }

    //31
    public static int[] removeNumberFromArray(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                count++;
            }
        }
            int[] newArr = new int[count];
            int current = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] != num) {
                    newArr[current] = arr[j];
                    current++;
                }
            }
            return newArr;
        }
    }
