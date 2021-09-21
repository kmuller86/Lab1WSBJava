import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        Scanner scan = new Scanner(System.in);
        System.out.printf("Podaj imie ");
        String zmiennaImie = scan.next();
        System.out.printf("Podaj nazwisko ");
        String zmiennaNazwisko = scan.next();
        System.out.printf("Podaj wiek ");
        int zmiennaWiek = scan.nextInt();
        System.out.printf("Podaj nr indeksu ");
        int zmiennaNrIdneksu = scan.nextInt();

        System.out.println("Imie: " + zmiennaImie + "; Nazwisko: " + zmiennaNazwisko + "; Wiek: " + zmiennaWiek + "; Nr indexu: " + zmiennaNrIdneksu);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programuS
        */
        System.out.println("Teraz kontynujemy czwiczenie ;)");
        System.out.println("Prosze podac 2 licby calkowite)");
        System.out.println("Wpisz pierwsza liczbe");
        int zmienna1 = scan.nextInt();
        System.out.println("Wpisz druga liczbe");
        int zmienna2 = scan.nextInt();

        int zmmiennaDodawanie = zmienna1 + zmienna2;
        int zmiennaOdejmowanie = zmienna1 - zmienna2;
        int zmiennaMnozenie = zmienna1 * zmienna2;
        int zmiennaDzielenie = zmienna1/zmienna2;
        int zmiennaModulo = zmienna1%zmienna2;

        System.out.println("Wynniki:");

        System.out.println(zmienna1 + " + " + zmienna2 + "= " + zmmiennaDodawanie);
        System.out.println(zmienna1 + " - " + zmienna2 + "= " + zmiennaOdejmowanie);
        System.out.println(zmienna1 + " * " + zmienna2 + "= " + zmiennaMnozenie);
        System.out.println(zmienna1 + " / " + zmienna2 + "= " + zmiennaDzielenie);
        System.out.println(zmienna1 + " % " + zmienna2 + "= " + zmiennaModulo);

        }
}
