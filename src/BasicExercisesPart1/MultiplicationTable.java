package BasicExercisesPart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MultiplicationTable {
    public static void Run() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        var a = sc.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(a + " x " + i + " = " + (a*i));
        }

    }
}
