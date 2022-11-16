public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(checkEvenOROdd(2));
    }
    public static String checkEvenOROdd(int num){
        if(num == 0){
            return "0 is not even nor odd";
        }else if(num % 2 == 0){
            return "The number is EVEN";
        }else{
            return "The number is ODD";
        }
    }
}
