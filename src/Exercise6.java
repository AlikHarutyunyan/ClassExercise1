public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(467));
    }
    public static int sumOfDigits(int num){
        int digit;
        int result = 0;
        do {
             digit = num % 10;
             num = num / 10;
             result += digit;
        }while(num != 0);

        return result;
     }
}
