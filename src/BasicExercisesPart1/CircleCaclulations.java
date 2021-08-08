
package BasicExercisesPart1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleCaclulations {
    public static void Run() throws IOException {
        Circle c = new Circle();
        c.CalcArea();
        c.CalcPerimeter();
    }
}

class Circle {

    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    double radius;

    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius, please: ");
        this.radius = sc.nextDouble();
    }

    public void CalcPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        System.out.println("the perimeter is " + this.decimalFormat.format(perimeter) );
    }

    public void CalcArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        System.out.println("the area is " + this.decimalFormat.format(area));
    }
}