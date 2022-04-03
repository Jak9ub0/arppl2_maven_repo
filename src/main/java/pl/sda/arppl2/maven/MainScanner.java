package pl.sda.arppl2.maven;

import com.sun.source.util.SourcePositions;

import javax.swing.*;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        System.out.println("Wpisz swoje imie: ");

        Scanner scanner = new Scanner(System.in);
        // deklaracja zmiennej slowo i przypisanie wartosci
        // ktora jest wynikiem funkcji next z obiektu scanner
        String slowo = scanner.next();

        System.out.println("Cześć "+ slowo + ", jestes najlepszym programista przy tej klawiaturze!");

        System.out.println("Podaj swój wiek: ");

        // deklaracja zmiennej liczba i przypisanie do niej wartosci
        // ktora jest wynikiem funkcji nextInt z obiektu scanner
        int liczba = scanner.nextInt(); // 59
        liczba = liczba / 10;

        System.out.println("Czy wiesz że żyjesz już " + liczba + " dekad");
    }
}
