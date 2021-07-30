package BasicExercisesPart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyTwoNumbers {

    public static void Run() throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.print("Enter 1st number: ");
        var a = Integer.parseInt(reader.readLine());

        System.out.print("Enter 2nd number: ");
        var b = Integer.parseInt(reader.readLine());

        var result = a * b;
        System.out.println(a + " x " + b + " = " + result);
    }
}
