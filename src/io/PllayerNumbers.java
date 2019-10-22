package io;

import DataChecker.MastermindBounds;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class PllayerNumbers {
    private Printer print = new Printer();
    private DataReader dr = new DataReader();
    private MastermindBounds mb = new MastermindBounds();

    public int setNumberOfTurns() {
        print.numberOfTurnsRecommendation();
        try {
            return dr.getInt();
        } catch (InputMismatchException e) {
            print.inputErrorNumberOfTurns();
            dr.nextLine();
            return 10;
        }
    }

    public List<Integer> getNumbers() {
        List<Integer> userNumbers = new ArrayList<>();
        int counter = 0;
        do {
            print.typeTheNumber(counter);
            try {
                int userNumber = dr.getInt();
                if (mb.check(userNumber)) {
                    userNumbers.add(userNumber);
                    counter++;
                } else {
                    print.inputErrorNumberNotAllowed();
                }
            } catch (InputMismatchException e) {
                print.inputErrorNotANumber();
                dr.nextLine();
            }
        } while (counter < 4);
        return userNumbers;
    }
}
