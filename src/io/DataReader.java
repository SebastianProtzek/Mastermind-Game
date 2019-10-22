package io;

import java.util.Scanner;

class DataReader {
    private Scanner sc = new Scanner(System.in);

    int getInt() {
        int playerInput = sc.nextInt();
        nextLine();
        return playerInput;
    }

    void nextLine() {
        sc.nextLine();
    }
}
