package ex01;

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        boolean isPrime = true;
        int countIrerators = 2;
        int inputNumber = 0;

        Scanner scannerInput = new Scanner(System.in);

        if(!scannerInput.hasNextInt()) {
            System.out.println("Illegal Argument");
            System.exit(-1);
        }

        inputNumber = scannerInput.nextInt();

        if(inputNumber < 2) {
            System.out.println("Illegal Argument");
            System.exit(-1);
        }

        for(int i = 2; i*i <= inputNumber && isPrime; i++){
            if (inputNumber % i == 0){
                countIrerators++;
                isPrime = false;
            }
            countIrerators = i;
        }

        System.out.print(isPrime);
        System.out.print(' ');
        System.out.println(countIrerators - 2);
    }
}
