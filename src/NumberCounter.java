import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int number = input.nextInt();

        while (number!=0) {
            number = input.nextInt();
            if (number > 0){
                positiveNumbers++;
            } else if (number < 0) {
                negativeNumbers++;
            }
            sum = number + sum;
            average =  sum /(double) (positiveNumbers + negativeNumbers);

        }



        System.out.println("Positive numbers: " + positiveNumbers);
        System.out.println("Negative numbers: " + negativeNumbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}
/*do {
            number = input.nextInt();
            if (number > 0){
                positiveNumbers++;
            } else if (number < 0) {
                negativeNumbers++;
            }
            sum = number + sum;
            average =  sum /(double) (positiveNumbers + negativeNumbers);
        } while (number!=0);*/