import java.util.Random;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //declared once
        P1Random randomGen = new P1Random(); //declared once

        //starts game first time
        System.out.println("START GAME #1");
        //integers
        int count = 1;
        int numberPlayed = 0;
        int playerWins = 0;
        int dealerWins = 0;
        int ties = 0;

        // random card generation #1
        int cardValue = randomGen.nextInt(13) + 1;
        int handValue = 0;

            if (cardValue == 1) {
                System.out.println("Your card is a ACE!"); // ace = 1
                handValue = handValue + 1;
            } else if (cardValue > 1 && cardValue <= 10) {
                System.out.println("Your card is a " + cardValue + "!"); // face value cards
                handValue += cardValue;
            } else if (cardValue == 11) {
                System.out.println("Your card is a JACK!"); // jack = 10
                handValue = handValue + 10;
            } else if (cardValue == 12) {
                System.out.println("Your card is a QUEEN!"); // queen = 10
                handValue = handValue + 10;
            } else if (cardValue == 13) {
                System.out.println(" Your card is a KING!"); // king = 10
                handValue = handValue + 10;
        }
        // prints hand value
        System.out.println("Your hand is: " + handValue);

        // generates menu
        System.out.println("1. Get another card");
        System.out.println("2. Hold hand");
        System.out.println("3. Print statistics");
        System.out.println("4. Exit");

        System.out.println("Choose an option:");
        int playerOption = scanner.nextInt();

        // use boolean test to execute while loop
        boolean test = true;

        while (test) {

        // switch test
        switch (playerOption){
            // generates another card for player
            case 1:
                // random card generation #2
                cardValue = randomGen.nextInt(13)+1;
                    if (cardValue == 1) {
                        System.out.println("Your card is a ACE!"); // ace = 1
                        handValue = handValue + 1;
                    } else if (cardValue > 1 && cardValue <= 10) {
                        System.out.println("Your card is a " + cardValue + "!"); // face value cards
                        handValue += cardValue;
                    } else if (cardValue == 11) {
                        System.out.println("Your card is a JACK!"); // jack = 10
                        handValue = handValue + 10;
                    } else if (cardValue == 12) {
                        System.out.println("Your card is a QUEEN!"); // queen = 10
                        handValue = handValue + 10;
                    } else if (cardValue == 13) {
                        System.out.println(" Your card is a KING!"); // king = 10
                        handValue = handValue + 10;
                }
                System.out.println("Your hand is: " + handValue);
                    // restarts game when player's hand value is equal to 21 and they automatically win
                    if (handValue == 21) {
                        count++;
                        System.out.println("BLACKJACK! You win!");
                        // starts game #2
                        System.out.println("START GAME #" + (count));
                        numberPlayed++;
                        playerWins++;
                        // generates another card
                        cardValue = randomGen.nextInt(13)+1;
                        handValue = 0;
                        if (cardValue == 1) {
                            System.out.println("Your card is a ACE!"); // ace = 1
                            handValue = handValue + 1;
                        } else if (cardValue > 1 && cardValue <= 10) {
                            System.out.println("Your card is a " + cardValue + "!"); // face value cards
                            handValue += cardValue;
                        } else if (cardValue == 11) {
                            System.out.println("Your card is a JACK!");
                            handValue = handValue + 10; // jack = 10
                        } else if (cardValue == 12) {
                            System.out.println("Your card is a QUEEN!");
                            handValue = handValue + 10; // queen = 10
                        } else if (cardValue == 13) {
                            System.out.println(" Your card is a KING!"); //13 = King
                            handValue = handValue + 10; // king = 10
                        }
                        // prints hand value
                        System.out.println("Your hand is: " + handValue);

                        System.out.println("1. Get another card");
                        System.out.println("2. Hold hand");
                        System.out.println("3. Print statistics");
                        System.out.println("4. Exit");
                        System.out.println("Choose an option:");
                        playerOption = scanner.nextInt();
                        test = true;

                    }
                    // if the hand value is greater than 21, then the player automatically loses and game restarts
                    else if (handValue > 21) {
                        System.out.println("You exceeded 21! You lose.");
                        count++;
                        // starts game #1
                        System.out.println("START GAME #" + (count));
                        numberPlayed++;
                        // random card generation #3
                        cardValue = randomGen.nextInt(13)+1;
                        handValue = 0;
                        if (cardValue == 1) {
                            System.out.println("Your card is a ACE!"); // ace = 1
                            handValue = handValue + 1;
                        } else if (cardValue > 1 && cardValue <= 10) {
                            System.out.println("Your card is a " + cardValue + "!"); // face value cards
                            handValue += cardValue;
                        } else if (cardValue == 11) {
                            System.out.println("Your card is a JACK!"); // jack = 10
                            handValue = handValue + 10;
                        } else if (cardValue == 12) {
                            System.out.println("Your card is a QUEEN!"); // queen = 10
                            handValue = handValue + 10;
                        } else if (cardValue == 13) {
                            System.out.println(" Your card is a KING!"); // king = 10
                            handValue = handValue + 10;
                        }
                        // prints hand value
                        System.out.println("Your hand is: " + handValue);

                        System.out.println("1. Get another card");
                        System.out.println("2. Hold hand");
                        System.out.println("3. Print statistics");
                        System.out.println("4. Exit");
                        System.out.println("Choose an option:");
                        playerOption = scanner.nextInt();
                        test = true;
                    }
                    // if neither of the previous conditions are met, game continues
                    else {

                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");

                System.out.println("Choose an option:");
                playerOption = scanner.nextInt();}
                break;

            // holds hand and generates dealer's hand
            case 2:
                count++ ;
                int dealerHand;
                // dealer card generation
                dealerHand = randomGen.nextInt(11) + 16;
                System.out.println("Dealer's hand: " + dealerHand);
                System.out.println("Your hand is: " + handValue);
                    // condition if dealer hand exceeds 21
                    if (dealerHand > 21) {
                        System.out.println("You win!");
                        playerWins++;
                    }
                    // condition if player's hand value equals 21
                    else if (handValue == 21) {
                        System.out.println("BLACKJACK! You win!");
                        playerWins++;
                    }
                    // condition if dealer's hand and player's hand are the same
                    else if (dealerHand == handValue) {
                        System.out.println("It's a tie! No one wins!");
                        ties++;
                    }
                    // condition if dealer's hand is less than or equal to 21 and is higher than player's hand value
                    else if (dealerHand <= 21 && dealerHand > handValue) {
                        System.out.println("Dealer wins!");
                        dealerWins++;
                    }
                    // condition if dealer's hand is less than 21 and is less than hand value
                    else if (dealerHand < 21 && dealerHand < handValue) {
                        System.out.println("You win!");
                        playerWins++;
                    }

                    test = false;

                // starts game #4
                System.out.println("START GAME #" + count);
                numberPlayed++;
                // generates random card #4
                cardValue = randomGen.nextInt(13)+1;
                handValue = 0;
                    if (cardValue == 1) {
                        System.out.println("Your card is a ACE!"); // ace = 21
                        handValue = handValue + 1;
                    } else if (cardValue > 1 && cardValue <= 10) {
                        System.out.println("Your card is a " + cardValue + "!"); // face value cards
                        handValue += cardValue;
                    } else if (cardValue == 11) {
                        System.out.println("Your card is a JACK!"); // jack = 10
                        handValue = handValue + 10;
                    } else if (cardValue == 12) {
                        System.out.println("Your card is a QUEEN!"); // queen = 10
                        handValue = handValue + 10;
                    } else if (cardValue == 13) {
                    System.out.println(" Your card is a KING!"); //13 = King
                    handValue = handValue + 10; // king = 10
                    }

                    // prints out hand value
                    System.out.println("Your hand is: " + handValue);

                    System.out.println("1. Get another card");
                    System.out.println("2. Hold hand");
                    System.out.println("3. Print statistics");
                    System.out.println("4. Exit");
                    System.out.println("Choose an option:");
                    playerOption = scanner.nextInt();
                    test = true;

                    break;

            // prints out game statistics
            case 3:
                System.out.println("Number of Player wins: " + playerWins);
                System.out.println("Number of Dealer wins: " + dealerWins);
                System.out.println("Number of tie games: " + ties);
                System.out.println("Total # of games played is: " + numberPlayed);
                // prints out percentage of wins as a decimal
                double percentWins;
                // quotient multiplied by 100 to make a percentage
                percentWins = (((double)playerWins / (double) numberPlayed) * 100);
                System.out.println("Percentage of Player wins: " + percentWins + "%");
                test = false;

                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.println("Choose an option:");
                playerOption = scanner.nextInt();
                test = true;

                break;

           // exits game
            case 4:
                System.exit(0);
                break;

            // notifies player that their choice is invalid if it is not between 1 and 4
            default:
                System.out.println("Invalid input!");
                System.out.println("Please enter an integer value between 1 and 4.");

                test = false;

                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.println("Choose an option:");
                playerOption = scanner.nextInt();
                test = true;
                break;


        }
//        while (handValue < 21) {
//            int generatedNumber = randomGen.nextInt(13);
//            System.out.println(generatedNumber);
//        }
    }
}}
