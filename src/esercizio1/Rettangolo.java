package esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double alt, double larg) {
        this.altezza = alt;
        this.larghezza = larg;
    }

    public double area() {
        return altezza * larghezza;
    }

    public double perimetro() {
        return (altezza + larghezza) * 2;
    }

    public void stampaRettangolo() {
        System.out.println("Area: " + area());
        System.out.println("Perimetro: " + perimetro());
    }
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {

        System.out.println("Rettangolo 1:");
        r1.stampaRettangolo();


        System.out.println("Rettangolo 2:");
        r2.stampaRettangolo();


        double sommaAree = r1.area() + r2.area();
        double sommaPerimetri = r1.perimetro() + r2.perimetro();

     System.out.println("Somma delle Aree: " + sommaAree);
        System.out.println("Somma dei Perimetri: " + sommaPerimetri);
    }

}
