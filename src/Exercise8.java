import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_ARRAY_SIZE = 5;
        int i = 0;
        int[] numbersArray = new int[MAX_ARRAY_SIZE];

        while (i < MAX_ARRAY_SIZE) {
            System.out.println("Write a number to add to the Array: ");
            numbersArray[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Write another number");
        int userNumber = scanner.nextInt();

        printNumbers(numbersArray);

        if(isInArray(numbersArray, userNumber)){
            System.out.println("The number is in array");
        }else{
            System.out.println("The number is not in array");
        }

        System.out.println("Sum of even indexes is: " + evenIndexSum(numbersArray));

        System.out.println("Sum of even values is: " + evenValueSum(numbersArray));

        if(isUnique(numbersArray)){
            System.out.println("The array is unique");
        }else{
            System.out.println("The array is not unique");
        }
    }

    public static void printNumbers(int[] numArr) {
        for (int j = 0; j < numArr.length; j++) {
           System.out.print(numArr[j] + ", ");
        }
        System.out.println();
    }

    public static boolean isInArray(int[] numArr, int numberToCheck){
        boolean result = false;
        for (int j = 0; j < numArr.length; j++) {
            if(numArr[j] == numberToCheck){
                result = true;
                break;
            }
        }
        return result;
    }

    public static int evenIndexSum(int[] numArr){
        int sum = 0;
        for (int j = 0; j < numArr.length; j++) {
            if(j%2 == 0){
                sum += numArr[j];
            }
        }
        return sum;
    }

    public static int evenValueSum(int[] numArr){
        int sum = 0;
        for (int j = 0; j < numArr.length; j++) {
            if(numArr[j]%2 == 0){
                sum += numArr[j];
            }
        }
        return sum;
    }

    public static boolean isUnique(int[] numArr){
        boolean result = true;
        for (int j = 0; j < numArr.length; j++) {
            for(int i = 0; i < numArr.length; i++){
                if(i!=j){
                    if(numArr[j] == numArr[i]){
                        result = false;
                    }
                }
            }
        }
        return result;
    }

}


