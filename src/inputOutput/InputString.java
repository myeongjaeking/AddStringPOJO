package inputOutput;

import java.util.Scanner;

public class InputString {

    public String getString() {

        return scanner.nextLine();
    }

    private final Scanner scanner;

    public InputString() {
        this.scanner = new Scanner(System.in);
    }

}
