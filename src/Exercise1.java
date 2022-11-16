public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(checkBiggestNumber(44,333,8));
    }
    public static int checkBiggestNumber(int firstNumber, int secondNumber, int thirdNumber){
        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            return firstNumber;
        }else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            return secondNumber;
        }else{
            return thirdNumber;
        }
    }
}
