package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
        int number;
        for (number = 100; number <1000; number++) {
            if (number%5==0 && number %6==0) {
                System.out.print(number + " ");
                if (number == 390){
                    System.out.println();
                    }
                if (number == 690){
                    System.out.println();
                }
                }
            }
        }
    }

