import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int guess;
        int tries = 1;
        int randomNumber = randomizeNumber(1,1000);
        boolean continuePlaying = true;
        boolean player1 = true;

        System.out.println("Write a number between 1 and 1000");

        do {
            guess = getUserInput(player1);
            if (guessingGame(guess, randomNumber)) {
                System.out.println("Congrats! You won after " + tries + " tries");
                continuePlaying = false;
            } else {
                player1 = !player1;
                tries++;
            }
        }while(continuePlaying);
    }
    public static int getUserInput(boolean player1){
        if(player1){
            System.out.println("Its player1's turn: ");
        }else{
            System.out.println("Its player2's turn: ");
        }
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int randomizeNumber(int startPoint, int endPoint){
        Random random = new Random();
        return random.nextInt(startPoint,endPoint);
    }
    public static boolean guessingGame(int guess, int randomNumber){
        boolean result;
        if(guess == randomNumber){
            result = true;
        }else{
            printHint(guess,randomNumber);
            result = false;
        }
        return result;
    }

    public static void printHint(int guess, int randomNumber){
        if(guess > randomNumber){
            System.out.println("Guess LOWER number");
        }else{
            System.out.println("Guess HIGHER number");
        }
    }
}
