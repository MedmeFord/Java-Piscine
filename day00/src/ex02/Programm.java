package ex02;

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        boolean isPrime = true;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong())
        {
            long number = scanner.nextLong();
            if (number == 42){
                break;
            }
            int summ = 0;
            while (number > 0){
                summ += number % 10;
                number = number / 10;
            }
            if (summ == 1){
                continue;
            }
            isPrime = true;
            for(int i = 2; i*i <= summ; i++)
            {
                if(summ % i == 0){
                    isPrime =false;
                    break;
                }
            }
            if (isPrime){
                count++;
            }
        }
        System.out.println("Count of coffee - request - " + count);
    }
}
