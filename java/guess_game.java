// import java.util.Random;
// import java.util.Scanner;

// class Guess {
//     int random_number;  // The random number to be guessed
//     int user_number;    // The user's guessed number

//     // Constructor to generate the random number
//     Guess() {
//         Random r = new Random();    
//         random_number = r.nextInt(1, 101); // Generates random number between 1 and 100
//     }

//     // Method to take user input
//     int enter_number() {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter your guess (1-100): ");
//         user_number = s.nextInt();
//         return user_number;
//     }

//     // Method to check if the guessed number is correct
//     boolean check_enternumber() {
//         if (user_number == random_number) {
//             System.out.println("Congratulations! You guessed the correct number: " + random_number);
//             return true; // Correct guess
//         } else if (user_number < random_number) {
//             System.out.println("Too low! Try again.");
//         } else {
//             System.out.println("Too high! Try again.");
//         }
//         return false; // Incorrect guess
//     }
// }

// public class guess_game {
//     public static void main(String[] args) {
//         Guess g = new Guess();  // Initialize the game
//         boolean isCorrect = false;

//         // Loop until the user guesses the correct number
//         while (!isCorrect)  { //if iscorrect is false then !iscorrect becomes ture (if iscorrect is true then not iscorrect becomes false) 
//             g.enter_number(); // Take user input
//             isCorrect = g.check_enternumber(); // Check if the guess is correct
//         }
//     }
// }


//2nd methode


import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class guess_game {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        boolean b= false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }

    }
}
