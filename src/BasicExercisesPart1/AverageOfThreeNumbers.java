package BasicExercisesPart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void Run() throws IOException {

        Scanner sc = new Scanner(System.in);

        float[] numbers = new float[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + " number:");
            numbers[i] = sc.nextFloat();
        }

        var average = 0;

        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }

        average /= numbers.length;

        System.out.println("The average is " + average);
    }
}
