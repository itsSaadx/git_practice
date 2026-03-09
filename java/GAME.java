import java.util.Scanner;
import java.util.Random;


class GAME {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rnd = new Random();

        // user input
        System.out.println("Choose your move: (rock, paper, scissor)");
        String playerinp = s.nextLine().toLowerCase();

        switch (playerinp) {
            case "rock":
                System.out.println("You chose ROCK");
                break;
            case "paper":
                System.out.println("You chose PAPER");
                break;
            case "scissor":
                System.out.println("You chose SCISSOR");
                break;
            default:
                System.out.println("INVALID choice");
                return;
        }

        // computer input

        int cmpinp = rnd.nextInt(3);

        if (cmpinp == 0) {
            System.out.println("COMPUTER CHOOSED ROCK");
        } else if (cmpinp == 1) {
            System.out.println("COMPUTER CHOOSED PAPER");
        } else if (cmpinp == 2) {
            System.out.println("COMPUTER CHOOSED SCISSOR");
        }

        // win section
        if ((playerinp.equals("rock") && cmpinp == 1) ||
            (playerinp.equals("paper") && cmpinp == 2) ||
            (playerinp.equals("scissor") && cmpinp == 0)) {
            System.out.println("COMPUTER WINS");


        } else if ((playerinp.equals("rock") && cmpinp == 2) ||
                   (playerinp.equals("paper") && cmpinp == 0) ||
                   (playerinp.equals("scissor") && cmpinp == 1)) {
            System.out.println("USER WINS");
        } 
        
        
        else {
            System.out.println("It's a TIE!");
        }

        s.close();
    }
}
