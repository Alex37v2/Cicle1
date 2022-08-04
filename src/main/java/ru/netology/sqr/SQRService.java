package ru.netology.sqr;

public class SQRService {

    public int checkNumber(int firstNumber, int secondNumber) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= firstNumber && i * i <= secondNumber) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}


