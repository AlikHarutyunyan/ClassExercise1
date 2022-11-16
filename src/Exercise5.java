public class Exercise5 {
    public static void main(String[] args) {
        if(checkIfPythagoras(3,4, 5)){
            System.out.println("Pythagoras theorem works with current numbers");
        }else{
            System.out.println("Pythagoras theorem DOESN'T work with current numbers");
        }
    }
    public static boolean checkIfPythagoras(int firstNumber, int secondNumber, int thirdNumber){
        return firstNumber * firstNumber + secondNumber * secondNumber == thirdNumber * thirdNumber;
    }
}
