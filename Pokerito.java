import java.util.Scanner;

public class pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("\n\t-> There are two players, you and the computer\n.");
        System.out.println("\t-> The Dealer will give each player one card.\n");
        System.out.println("\t-> Then, the Dealer will draw five cards (the river)\n");
        System.out.println("\t-> The player with the most river matches wins!\n");
        System.out.println("\t-> If the matches are equal, everyone's a winner!");
        System.out.println("\nReady? Type anything if you are.");
        scan.nextLine();
        String userCard = randomCard();
        String computerCard = randomCard();

        System.out.println("Here's your Card \n" + userCard);
        System.out.println("Computer's Card \n" + computerCard);

        System.out.println("Now, the Dealer will draw five cards. Press enter to continue.");

        for (int i = 1; i < 6; i++) {
            String riverCard = randomCard();
            scan.nextLine();
            System.out.println("card " + i + ":\n" + riverCard);
        }
        String riverCard = randomCard();

        int userMatch = 0;
        int computerMatch = 0;

        if (userCard.equals(riverCard)) {
            userMatch++;
        }
        System.out.println("Your Matches: " + userMatch);

        if (computerCard.equals(riverCard)) {
            computerMatch++;

        }
        System.out.println("Computer Matches: " + computerMatch);

        if (userMatch > computerMatch) {
            System.out.println("You Win!");
        }

        else if (computerMatch > userMatch) {
            System.out.println("Computer Wins!");
        }

        else {
            System.out.println("Everyone Wins!");
        }

    }

    public static String randomCard() {
        int card = (int) (Math.random() * 13 + 1);
        switch (card) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";

            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";

            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";

            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";

            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";

            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";

            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";

            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";

            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";

            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";

            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";

            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";

            case 13:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";

            default:
                return "Not Possible";

        }
    }
}
