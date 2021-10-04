import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int zmiennaMojWiek = 27;
        int zmiennaDoDzielenia= 3;

        if (zmiennaMojWiek%zmiennaDoDzielenia==0) {
            System.out.println("Wiek podzielny przez 3");
        }
        else {
            System.out.println("Wiek niepodzielny przez 3");

        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int nrIndexu = 58998;
        int zmiennaDoDzielenia2 = 2;

        if (nrIndexu%zmiennaDoDzielenia2==0 && nrIndexu>zmiennaDoDzielenia2 && zmiennaDoDzielenia2!=0) {

            System.out.println("nrIndexu: " +nrIndexu+ " jest parzysty");
        }
        else {
            System.out.println("nrIndexu: " +nrIndexu+ " nie jest parzysty");

        }
        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner clipboard = new Scanner(System.in);
        System.out.println("prosze podac liczbe");
        float clipboard2 = clipboard.nextFloat();
        if (clipboard2==0 || clipboard2<0)
        {
            System.out.println(clipboard2+" mniejsze albo rowne 0 ");
        }

        else if (clipboard2 > 0 && clipboard2 <100)
        {
            System.out.println(clipboard2+" wieksze od 0 i mniejsze 100 ");
        }
        else
        {
            System.out.println(clipboard2+" wieksze 100 ");
        }


    }
}
