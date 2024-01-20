package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        number = number%10 * 100 + (number /10)%10 *  10 + (number /100);
    }

}
