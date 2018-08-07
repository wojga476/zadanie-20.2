package pl.javastart;

import java.util.ArrayList;
import java.util.List;

public class FibonacciString {

    public int fibonacciString(int maxSum) {

        int number1 = 1;
        int number2 = 1;
        int number3 = 0;
        int sumNext = 0;
        int suma = 0;


        while (sumNext < maxSum) {

            if (number3 % 2 == 0) {
                sumNext += number3;
            }
            if (sumNext < maxSum) {
                suma = sumNext;
            }

            number3 = number1 + number2;

            number1 = number2;
            number2 = number3;
        }
        return suma;
    }
}
