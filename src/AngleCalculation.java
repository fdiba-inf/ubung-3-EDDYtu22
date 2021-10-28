import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double deg;
        double rad;
        double value;
        char type;


            do {
                value = input.nextDouble();
                type = input.next().charAt(0);

                if (type=='r') {
                    deg = 180*value/Math.PI;
                    System.out.println("Angle: " + deg  + " d");
                }
                if (type=='d') {
                    rad = value*Math.PI/180;
                    System.out.println("Angle: " + rad + " r");
                }



            } while (type=='r' || type=='d');

    }
}
