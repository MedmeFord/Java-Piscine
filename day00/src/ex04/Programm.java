package ex04;

import sun.awt.Mutex;
import sun.util.resources.ms.CalendarData_ms_MY;

import java.awt.event.WindowStateListener;
import java.sql.Array;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Programm {
    public static int[] getCountOfLine(String myText) {
        int[] counts = new int[65535];
        char[] Text = myText.toCharArray();
        int i = 0;
        while (i < myText.length()) {
            counts[Text[i]]++;
            i++;
        }
        return counts;
    }

    public static int getMaxCount(int[] arr,int firstIndex, int lastIndex) {
        int maxElement = 0;
        for (int j = firstIndex; j <= lastIndex; j++) {
            if (maxElement < arr[j]) {
                maxElement = arr[j];
            }
        }
        return maxElement;
    }
    public static char[] getTopTen(int[] counts, int[] arrInt) {
        char[] myTen = new char[10];
        int indexFirstElement = 0;
        int indexLastElement = 0;
        boolean checkFieldFurstElement = false;

        for (int i = 0;i < 65535; i++) {
            if (counts[i] > 0) {
                if (!checkFieldFurstElement) {
                    indexFirstElement = i;
                    checkFieldFurstElement = true;
                }
                indexLastElement = i;
            }
        }

        for (int i = 0; i < 10; i++) {
            int maxElement = getMaxCount(counts, indexFirstElement, indexLastElement);
            for (int j = indexFirstElement; j <= indexLastElement; j++) {
                if (counts[j] == maxElement && counts[j] != 0) {
                    myTen[i] = (char) j;
                    arrInt[i] = counts[j];
                    counts[j] = 0;
                    break;
                }
            }
            maxElement = 0;
        }
        return myTen;
    }

    public static void printStatic(int[] arrInt, char[] myTen) {
        for (int i = 0; i < 10; i++) {
            if (myTen[i] != 0) {
                System.out.println("Top: " + i + "\tLater-\'" + myTen[i] + "\'\tCount later for text:" + arrInt[i]);
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myText = scanner.nextLine();

        int[] arrInt = new int[10];
        int[] counts = getCountOfLine(myText);
        char[] myTen = getTopTen(counts, arrInt);
        printStatic(arrInt, myTen);
    }
}
