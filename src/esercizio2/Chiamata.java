package esercizio2;


public class Chiamata {
    private String numeroChiamato;
    private int durata;


    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }


    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }


    public void stampaDettaglioChiamata() {
        System.out.println("Numero di telefono chiamato: " + numeroChiamato);
        System.out.println("Durata: " + durata + " minuti");
    }
}