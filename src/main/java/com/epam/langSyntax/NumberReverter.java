package com.epam.langSyntax;

public class NumberReverter {

    public int revert(int number) {
        number = number%10 * 100 + (number /10)%10 *  10 + (number /100);
        return number;
    }

}
