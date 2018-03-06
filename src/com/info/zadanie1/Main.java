package com.info.zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int i=0;

        System.out.println("Wylosuj liczbę z przedziału od 1 do ? (podaj liczbę):");
        String maxRange = reader.next();

        Random generator = new Random();
        int randomNumber = generator.nextInt(Integer.parseInt(maxRange))+1;


        System.out.println("Wylosowano liczbę, zgadnij którą, masz 3 próby:" + randomNumber);
        while(i < 3)
        {
            if(randomNumber == Integer.parseInt(reader.next())){
                System.out.println("Super zgadłeś liczbę");
                break;

            }
            else{
                System.out.println("Pudło");
                i++;
            }
        }
    }
}
