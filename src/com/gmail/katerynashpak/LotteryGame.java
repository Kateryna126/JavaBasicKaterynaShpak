package com.gmail.katerynashpak;


import java.util.Random;

public class LotteryGame {
    public static void main(String[] args) {
        int[] lotteryNumbers = generateRandomNumbers(7);
        int[] playerNumbers = generateRandomNumbers(7);

    }

    public static int[] generateRandomNumbers(int length) {
        int[] numbers = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(10);
        }

        return numbers;
    }

}