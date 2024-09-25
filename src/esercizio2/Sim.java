package esercizio2;

public class Sim {



    private String numeroTelefono;
    private double credito;
    private Chiamata[] listaChiamate;


    public Sim(String numeroTelefono, double credito,Chiamata[] chiamata) {
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        this.listaChiamate = chiamata;
    }


    public void stampaListaChiamate() {

            for (Chiamata chiamata : listaChiamate) {
                chiamata.stampaDettaglioChiamata();
            }
        }


    public void stampaDettagliSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito residuo: " + credito + " €");
         stampaListaChiamate();
    }

}