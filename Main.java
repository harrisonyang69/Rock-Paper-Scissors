import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Rock Paper Scissors. To continue press any button. To exit press 'x'.");
        String inputString = "";
        Scanner scan = new Scanner(System.in);
        inputString = scan.next();
        int user1Wins = 0, user2Wins = 0, Draws = 0;


        while(inputString != "x") {
            if(inputString.equals("x")) {
                break;
            }

            System.out.println("*******************************************************************************************************************************************************************************");
            System.out.println("Draws: " + Draws + "\t\tUser 1 Wins: " + user1Wins + "\t\tUser 2 Wins: " + user2Wins);
            System.out.println("User 1, please enter your choice. 'r' for rock, 'p' for Paper, 's' for Scissors. To exit press 'x'. #Note- not entering r, p, s, or x will cause the program to terminate.");
            String inputStringGame = scan.next(), userChoice = "";

            if(inputStringGame.equals("x")) {
                break;
            } else if (inputStringGame.equals("s")) {
                userChoice = "Scissors";
                System.out.println(userChoice);
            } else if (inputStringGame.equals("p")) {
                userChoice = "Paper";
                System.out.println(userChoice);
            } else if (inputStringGame.equals("r")) {
                userChoice = "Rock";
                System.out.println(userChoice);
            } else {
                System.out.println("Invalid Selection.");
                break;
            }
            System.out.println();


            System.out.println("User 2, please enter your choice. 'r' for rock, 'p' for Paper, 's' for Scissors. To exit press 'x'.");
            String inputString2 = scan.next(), userChoice2 = "";

            if(inputString2.equals("x")) {
                break;
            } else if (inputString2.equals("s")) {
                userChoice2 = "Scissors";
                System.out.println(userChoice2);
            } else if (inputString2.equals("p")) {
                userChoice2 = "Paper";
                System.out.println(userChoice2);
            } else if (inputString2.equals("r")) {
                userChoice2 = "Rock";
                System.out.println(userChoice2);
            } else {
                System.out.println("Invalid Selection.");
                break;
            }
            System.out.println();


            if (userChoice.equals(userChoice2)) {
                System.out.println("User choices are the same. " + "Draw!");
                Draws++;
            } else if (userChoice.equals("Rock") && userChoice2.equals("Scissors")) {
                System.out.println("User 1's choice is " + userChoice + " and User 2's choice is " + userChoice2 + ". User 1 wins!");
                user1Wins++;
            } else if (userChoice.equals("Rock") && userChoice2.equals("Paper")) {
                System.out.println("User 1's choice is " + userChoice + " and User 2's choice is " + userChoice2 + ". User 2 wins!");
                user2Wins++;
            } else if (userChoice.equals("Scissors") && userChoice2.equals("Paper")) {
                System.out.println("User 1's choice is " + userChoice + " and User 2's choice is " + userChoice2 + ". User 1 wins!");
                user1Wins++;
            } else if (userChoice.equals("Scissors") && userChoice2.equals("Rock")) {
                System.out.println("User 1's choice is " + userChoice + " and User 2's choice is " + userChoice2 + ". User 2 wins!");
                user2Wins++;
            } else if (userChoice.equals("Paper") && userChoice2.equals("Scissors")) {
                System.out.println("User 1's choice is " + userChoice + " and User 2's choice is " + userChoice2 + ". User 2 wins!");
                user2Wins++;
            } else if (userChoice.equals("Paper") && userChoice2.equals("Rock")) {
                System.out.println("User 1's choice is " + userChoice + " and User 2's choice is " + userChoice2 + ". User 1 wins!");
                user1Wins++;
            }

        }
    }
}
