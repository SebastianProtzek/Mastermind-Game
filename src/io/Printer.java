package io;

import java.util.Arrays;
import java.util.List;

public class Printer {
    private void print(String text) {
        System.out.println(text);
    }

    private void printError(String text) {
        System.err.println(text);
    }

    public void greetingMessage() {
        print("\nWelcome to the Mastermind game! If you don't know the rules, check them online:\n" +
                "https://www.wikihow.com/Play-Mastermind\n" +
                "The one difference is: I used numbers from 1 to 6 instead of colors. Good luck!\n");
    }

    public void playerNumbers(List<Integer> playerNumbers) {
        print("\nYour numbers are: " + Arrays.toString(playerNumbers.toArray()));
    }

    public void result(int rightNumberAndPlace, int rightNumber, int turnsLeft) {
        print("Your result:\n" +
                "Right numbers on the right place: " + rightNumberAndPlace + ".\n" +
                "Right numbers on the wrong place: " + rightNumber + ".\n" +
                "Turns left: " + turnsLeft + ".");
    }

    public void winningMessage(int allTurns, int turnsLeft) {
        print("Congratulations, you won! It took you " + (allTurns - turnsLeft) + " turns!");
    }

    public void losingMessage(List<Integer> masterNumbers) {
        print("There is no turn left, you lose! :(\n" +
                "The right numbers were: " + Arrays.toString(masterNumbers.toArray()) + "\n" +
                "Maybe you need more turns? Good luck next time and goodbye!");
    }

    void numberOfTurnsRecommendation() {
        print("First of all - choose the number of turns in the game. We recommend you to choose 10.");
    }

    void typeTheNumber(int counter) {
        print("Type the " + (counter + 1) + ". number:");
    }

    void inputErrorNumberNotAllowed() {
        printError("Allowed numbers are: 1, 2, 3, 4, 5 and 6");
    }

    void inputErrorNotANumber() {
        printError("This is not a number!");
    }

    void inputErrorNumberOfTurns() {
        printError("Wrong input! The number of turns will be set to 10...");
    }

}
