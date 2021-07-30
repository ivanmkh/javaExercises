package BasicExercisesPart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionOfTwoNumbers {
    public static void Run() throws IOException {

        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        System.out.print("Enter the first number: ");
        var a = Integer.parseInt(reader.readLine());
        System.out.print("Enter the second number: ");
        var b = Integer.parseInt(reader.readLine());

        var c = a / b;

        // Printing the read line
        System.out.println("The result of division is: " + c);

    }
}
