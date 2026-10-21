// ATT-GÖRA:
// [X] 1. Klass Katt: namn, chipnummer, ras, konstruktor, getters
// [X] 2. Klass KattHotell: privat lista och en dörr in
// [X] 3. Dubblettskydd på chipnummer, testas från Main
// [X] 4. Print som skriver namn, ras och chipnummer
// [X] 5. Visa när hotellet är tomt

public class Main {
    public static void main(String[] args) {
        KattHotell hotell = new KattHotell();
        hotell.listaAlla();
        hotell.laggTill(new Katt("Bo", 101, "Siames"));
        hotell.laggTill(new Katt("Lulu", 102, "Ragdoll"));
        //if (!hotell.laggTill(new Katt("Kopia", 101, "Perser"))) {
        //    System.out.println("Dubblett nekad");
        //}
        System.out.println("Antal: " + hotell.antalKatter());
        hotell.listaAlla();
    }
}