package pl.coderslab.game1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();
        int toGuess = generator.nextInt(101);
        int guessed = 200;
        boolean win = false;
        Scanner scan = new Scanner(System.in);

        while (win == false) {
            System.out.print("Zgadnij liczbę ");
           while (!scan.hasNextInt()) {
               System.out.println("To nie jest liczba");
               scan.next();
           }
            guessed = scan.nextInt();

            if (guessed == toGuess) {

                win = true;
            }
            else if (guessed < toGuess) {
                System.out.println("Za mało!");
            }
            else if (guessed > toGuess) {
                System.out.println("Za dużo!");
            }
        }
        System.out.println("Zgadłeś!");
    }
}
//Napisz prostą grę w zgadywanie liczb. Komputer ma wylosować liczbę w zakresie od 1 do 100. Następnie:
//
//wypisać: "Zgadnij liczbę" i pobrać liczbę z klawiatury;
//sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat: "To nie jest liczba", po czym wrócić do pkt. 1;
//jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat: "Za mało!", po czym wrócić do pkt. 1;
//jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat: "Za dużo!", po czym wrócić do pkt. 1;
//jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat: "Zgadłeś!", po czym zakończyć działanie programu.