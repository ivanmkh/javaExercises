package BasicExercisesPart1;

import java.io.IOException;
import java.util.Scanner;

public class SwapVariables {

    public String value1;
    public String value2;

    public static void Run() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value, please: ");
        var value1 = sc.next();

        System.out.print("Enter the second value, please: ");
        var value2 = sc.next();

        System.out.println("The first value is " + value1 + ", and the second is " + value2);
        System.out.println("Processing .. ");

        var temp = value1;
        value1 = value2;
        value2 = temp;

        System.out.println("The first value is " + value1 + ", and the second is " + value2);

    }
}
