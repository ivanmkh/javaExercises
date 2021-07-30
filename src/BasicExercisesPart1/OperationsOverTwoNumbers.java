package BasicExercisesPart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationsOverTwoNumbers {
    public static void Run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input the 1st number: ");
        var a = Integer.parseInt(reader.readLine());
        System.out.println("Input the 2nd number: ");
        var b = Integer.parseInt(reader.readLine());

        var sum = a + b;
        var substruction = a - b;
        var multiplification = a * b;
        var division = a / b;
        var modulation = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + substruction);
        System.out.println(a + " * " + b + " = " + multiplification);
        System.out.println(a + " / " + b + " = " + division);
        System.out.println(a + " % " + b + " = " + modulation);
    }
}
