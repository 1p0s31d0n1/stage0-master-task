package com.epam.langSyntax;

public class DigitsSumCalculator {

    public int calculateSum(int number) {
        int x = 0;
        while (number != 0) {
            x += number%10;
            number /= 10;
        }
        return x;
    }

}
