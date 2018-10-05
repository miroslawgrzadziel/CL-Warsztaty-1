package pl.coderslab.game2;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int [] userNumbers = new int[6];
        int [] randomNumbers = new int[6];
//        int userNumber = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("podaj liczbę nr "+(i+1)+": ");
            int userNumber = 0;

            while (true ) {
                userNumber = getInt();

                boolean range = false;
                if (1<=userNumber && userNumber<=49){
                    range = false;
                }else{
                    range = true;
                }
// continue przerywa wykonywanie i przechodzi do następnego kroku pętli
                for(range = true){
                    System.out.print("Podaj liczbe z zakresu od 1 do 49: ");
                }

                boolean exist = false; // sprawdzenie czy użytkownik wpisał już taka liczbę

                for(int val : userNumbers){
                    if (val == userNumber){
                        exist = true;
                    }
                }
                if(!exist && userNumber != 0)
                    break;
                else
                    System.out.print("Liczba została już użyta. Podaj inną liczbę: ");

            }

            userNumbers[i]=userNumber;

        }
        System.out.println(Arrays.toString(userNumbers));
    }


    public static int getInt(){
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("To nie jest liczba!");
            scan.next();
        }
        return scan.nextInt();
    }
}

//Symulator LOTTO
//Jak wszystkim wiadomo, LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu od 1 do 49. Zadaniem gracza jest poprawne wytypowanie losowanych liczb. Nagradzane jest trafienie 3, 4, 5 lub 6 poprawnych liczb.
//
//Napisz program, który:
//
//zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:
//czy wprowadzony ciąg znaków jest poprawną liczbą,
//czy użytkownik nie wpisał tej liczby już poprzednio,
//czy liczba należy do zakresu 1-49,
//po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,
//wylosuje 6 liczb z zakresu i wyświetli je na ekranie,
//poinformuje gracza, czy trafił przynajmniej "trójkę".