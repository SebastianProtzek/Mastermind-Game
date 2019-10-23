package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class NumbersGenerator {
    private final int firstNumber = generateNumber();
    private final int secondNumber = generateNumber();
    private final int thirdNumber = generateNumber();
    private final int fourthNumber = generateNumber();

    private int numberOfTurns;

    private List<Integer> masterNumbers = new ArrayList<>(Arrays.asList(firstNumber, secondNumber, thirdNumber,
            fourthNumber));

    private int generateNumber() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }

    void setDefaultNumbers() {
        masterNumbers.set(0, firstNumber);
        masterNumbers.set(1, secondNumber);
        masterNumbers.set(2, thirdNumber);
        masterNumbers.set(3, fourthNumber);
    }

    int getNumberOfTurns() {
        return numberOfTurns;
    }

    void setNumberOfTurns(int numberOfTurns) {
        this.numberOfTurns = numberOfTurns;
    }

    List<Integer> getMasterNumbers() {
        return masterNumbers;
    }
}
