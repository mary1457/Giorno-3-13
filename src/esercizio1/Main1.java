package esercizio1;

import static esercizio1.Rettangolo.stampaDueRettangoli;

public class Main1 {

    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5, 3);


        rettangolo.stampaRettangolo();


        Rettangolo rettangolo1 = new Rettangolo(5, 3);
        Rettangolo rettangolo2 = new Rettangolo(7, 2);


        stampaDueRettangoli(rettangolo1, rettangolo2);
    }

}
