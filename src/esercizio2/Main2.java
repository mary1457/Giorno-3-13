package esercizio2;

public class Main2 {
    public static void main(String[] args) {


        Chiamata[] listaChiamate = new Chiamata[5];
        listaChiamate[0] = new Chiamata("39 3494278805", 20);
        listaChiamate[1] = new Chiamata("39 3494278805", 1);
        listaChiamate[2] = new Chiamata("39 3494275405", 7);
        listaChiamate[3] = new Chiamata("39 3494278876", 1);
        listaChiamate[4] = new Chiamata("39 3494272358", 13);
        Sim nuovaSim = new Sim("3331234567", 20.0,listaChiamate);

        nuovaSim.stampaDettagliSim();
    }
}