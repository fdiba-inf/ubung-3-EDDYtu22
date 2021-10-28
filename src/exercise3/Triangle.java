package exercise3;
import java.lang.Math;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;

        do {
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            double s = (a+b+c)/2;
            if ((a+b)>c && (a+c)>b && (b+c)>a) {
                double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.println("Area: " + area);
                if (a==b && b==c) {
                    System.out.println("Triangle: equilateral" );
                } else if (a==b){
                    System.out.println("Triangle: isosceles");
                } else {
                    System.out.println("Triangle: scalene");
                }
            } else {
                System.out.println("Values are not correct!");
            }

        } while (a!=0 && a>0 && b!=0 && b>0 && c!=0 && c>0);

    }

}


