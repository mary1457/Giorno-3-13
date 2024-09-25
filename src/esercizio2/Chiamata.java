package esercizio2;


public class Chiamata {
    private final String numeroChiamato;
    private final int durata;


    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }




    public void stampaDettaglioChiamata() {
        System.out.println("Numero di telefono chiamato: " + numeroChiamato);
        System.out.println("Durata: " + durata + " minuti");
    }
}