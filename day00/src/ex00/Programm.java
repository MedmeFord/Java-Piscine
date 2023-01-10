package ex00;

public class Programm {
    public static void main(String[] args) {
        int sumThis = 479598;
        int result = 0;

        for(int i = 5; i >= 0; i--) {
            result += sumThis % 10;
            sumThis = sumThis/10;
        }

        System.out.println("Outputting resault sums of a six-digit number: " + result);
    }
}
