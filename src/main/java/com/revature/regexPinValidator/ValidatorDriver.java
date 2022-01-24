package com.revature.regexPinValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.revature.regexPinValidator.PinValidator.PinValidator.validatePin;

public class ValidatorDriver {
    public static void main(String[] args) throws IOException {

        boolean running = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Enter a PIN to be validated: ");

            String input = reader.readLine();

            boolean result = validatePin(input);

            System.out.println(result);

            boolean again = true;

            do {
                System.out.print("\nWould you Like to enter another pin? (Y/N): ");
                input = reader.readLine().toUpperCase();

                switch (input) {
                    case "Y":
                        again = false;
                        break;

                    case "N":
                        again = false;
                        running = false;
                        break;

                    default:
                        System.out.print("\nI'm sorry, I couldn't make sense of your response.");

                }
                System.out.println();

            } while (again);

        } while (running);

        System.out.println("Thanks for trying out the Pin Validator!");

    }
}
