package pl.sda.arppl2.maven;

public class MainDebugger {
    public static void main(String[] args) {
        // ###########################################
        // int, double, byte, char, short, long
        // Integer, Double, Float, Byte, Character, Short, Long
        // Deklaracje:
        // Zmienna z wartoscia ktora jest liczba calkowita
        int a;
        // a = 5;
        // a = a+1;

        // Zmienna z wartoscia ktora jest liczba zmiennoprzecinkowa
        // duzej precyzji (zajmuje 64 bity = 8 bajtow)
        double b;

        // malej precyzji (zajmuje 32 = 4 bajty)
        float c;
        Float cc;
        // tekst - ciag liter
        String zmiennaZTekstem;
        // ############################################

        // Deklaracje z inicjalizacja:
        int zmiennaZWartosciaCalkowita = 5;

        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita +10;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita * 23;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita / 7;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita +10;

        // to jest wypisanie tresci tekstowej
        System.out.println("zmiennaZWartosciaCalkowita");

        // to jest wypisanie wartosci
        System.out.println(zmiennaZWartosciaCalkowita);
        System.err.println("to jest inny wypis");



    }
}
