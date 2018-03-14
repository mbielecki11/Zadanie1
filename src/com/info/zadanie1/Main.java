package com.info.zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int i=0;
        int randomNumber = 0;
        boolean isGood = false;

        while(!isGood) {
            try {
                System.out.println("Wylosuj liczbę z przedziału od 1 do ? (podaj liczbę):");
                String maxRange = reader.next();

                Random generator = new Random();
                randomNumber = generator.nextInt(Integer.parseInt(maxRange)) + 1;
                isGood = true;
            }
            catch (NumberFormatException n) {
                System.out.println("Niepoprawne dane wejściowe");
            }
            catch (IllegalArgumentException m) {
                System.out.println("Podaj liczbę większą od 1");
            }
        }

        System.out.println("Wylosowano liczbę, zgadnij którą, masz 3 próby:");

        while(i < 3)
        {
            try {
                if (randomNumber == Integer.parseInt(reader.next())) {
                    System.out.println("Super zgadłeś liczbę");
                    break;

                } else {
                    System.out.println("Pudło");
                    i++;
                }
            }
            catch (NumberFormatException n) {
                System.out.println("Niepoprawne dane wejściowe");
            }
        }
        if (i == 3) {
            System.out.println("Nie udało Ci się odgadnąć liczby. Spróbuj następnym razem.");
        }
    }
}
