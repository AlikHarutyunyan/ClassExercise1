public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(checkIfPrime(17));
    }
    public static String checkIfPrime(int num) {
        if (num < 2) {
            return "The number is not PRIME";
        }
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                return "The number is not PRIME";
            }
        }
        return "The number is PRIME";

    }
}
