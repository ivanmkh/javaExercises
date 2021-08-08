
package BasicExercisesPart1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RectangleCaclulations {
    public static void Run() throws IOException {
        Rectangle c = new Rectangle();
        c.CalcArea();
        c.CalcPerimeter();
    }
}

class Rectangle {

    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    double aSide, bSide;

    public Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a side, please: ");
        this.aSide = sc.nextDouble();
        System.out.print("Enter the b side, please: ");
        this.bSide = sc.nextDouble();
    }

    public void CalcPerimeter() {
        double perimeter = 2 * (this.aSide + this.bSide);
        System.out.println("the perimeter is " + this.decimalFormat.format(perimeter) );
    }

    public void CalcArea() {
        double area = this.aSide * this.bSide;
        System.out.println("the area is " + this.decimalFormat.format(area));
    }
}