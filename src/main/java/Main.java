import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int secretNumber = 33;
        String Greeting = "Please Guess a Number Between 1 and 99";
        System.out.println(Greeting);

        //User Input?

        Scanner reader = new Scanner(System.in);
        int guessedNumber = reader.nextInt();


        System.out.println(guessedNumber);
        System.out.println("Your Guessed Number is" + guessedNumber);

        //If guessedNumber is correct, print "You Win!"
        //If guessedNumber is incorrect, print "Guess Higher" or "Guess Lower"

        if (guessedNumber == secretNumber){
            System.out.println("Congratulations! You Won!");
        } else if (guessedNumber > secretNumber) {
            System.out.println("A Little too high, Guess Lower!");
        } else if (guessedNumber < secretNumber) {
            System.out.println("A little too low, Guess Higher!");

        }
    }
    }
