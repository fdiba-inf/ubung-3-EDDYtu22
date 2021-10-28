package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
        int number;
        int counter = 0;
        for (number=100; number<1000; number++) {
            if (number%5==0 && number%6==0) {
                System.out.print(number + " ");
                counter++;
                if (counter%10==0) {
                    System.out.println();
                }
            }
        }


    }

}




    /*for (number = 100; number <1000; number++) {

        if (number%5==0 && number %6==0) {
        System.out.print(number + " ");

        if (counter %10 == 1){
        System.out.println();
        }
        }
        }*/

