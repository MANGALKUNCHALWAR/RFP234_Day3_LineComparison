import java.util.Scanner;

public class UC2_Check_Equality_Length {
    //As a fan of geometry, I want to check equality of two lines
    //based on the end points, So that I know when two lines are the equal.
    // - Using Java equals method to check equality of 2 Lengths is preferable.
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, x4, y4;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value Of x1:");
        x1 = sc.nextDouble();

        System.out.println("Enter The Value Of y1:");
        y1 = sc.nextDouble();

        System.out.println("Enter The Value Of x2:");
        x2 = sc.nextDouble();

        System.out.println("Enter The Value Of y2:");
        y2 = sc.nextDouble();

        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length Of Line Is :" + length);

        System.out.println("Enter The Value Of x3:");
        x3 = sc.nextDouble();

        System.out.println("Enter The Value Of y3:");
        y3 = sc.nextDouble();

        System.out.println("Enter The Value Of x4:");
        x4 = sc.nextDouble();

        System.out.println("Enter The Value Of y4:");
        y4 = sc.nextDouble();

        double length1 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length Of Line Is :" + length1);

        if (length == length1)
        {
            System.out.println("length of both line are equal:");
        }
        else
        {
            System.out.println("length of both line are not equal:");
        }

    }
}
