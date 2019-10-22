package Main;

import DataChecker.Comparator;
import DataChecker.WonOrNot;
import io.Printer;
import io.PllayerNumbers;
import java.util.List;

public class MastermindGame {
    public static void main(String[] args) {
        NumbersGenerator ng = new NumbersGenerator();
        Printer print = new Printer();

        List<Integer> masterNumbers = ng.getMasterNumbers();
        int userInput = ng.getNumberOfTurns();
        ng.setNumberOfTurns(userInput);
        print.greetingMessage();
        controlLoop(masterNumbers, ng, print);
    }

    private static void controlLoop(List<Integer> masterNumbers, NumbersGenerator ng, Printer printer) {
        PllayerNumbers pn = new PllayerNumbers();
        Comparator com = new Comparator();
        WonOrNot won = new WonOrNot();

        int allTurns = pn.setNumberOfTurns();
        int turnsLeft =  allTurns;
        boolean didPlayerWon;
        do {
            turnsLeft--;
            List<Integer> playerNumbers = pn.getNumbers();
            printer.playerNumbers(playerNumbers);

            List<Integer> guessResult = com.compareNumbers(masterNumbers, playerNumbers);
            printer.result(guessResult.get(0), guessResult.get(1), turnsLeft);

            didPlayerWon = won.checkIfWon(guessResult);
            if (didPlayerWon) {
                printer.winningMessage(allTurns, turnsLeft);
            }
            ng.setDefaultNumbers();
        } while (turnsLeft > 0 && !didPlayerWon);
        if (!didPlayerWon) {
            printer.losingMessage(masterNumbers);
        }
    }
}
