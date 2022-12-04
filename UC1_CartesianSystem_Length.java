import java.util.Scanner;

public class UC1_CartesianSystem_Length {

    //***(1)***As a fan of geometry, I want to model a line based on a point
    //consisting of (x, y) co-ordinates using the Cartesian system,So that I can calculate its length.
    //- A Length as 2 Points (x1, y1) and (x2, y2)
    // - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
    public static void main(String[] args) {
        double x1,y1,x2,y2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value Of x1:");
        x1=sc.nextDouble();

        System.out.println("Enter The Value Of y1:");
        y1=sc.nextDouble();

        System.out.println("Enter The Value Of x2:");
        x2=sc.nextDouble();

        System.out.println("Enter The Value Of y2:");
        y2=sc.nextDouble();

        double length = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        System.out.println("Length Of Line Is :" + length);

    }

}