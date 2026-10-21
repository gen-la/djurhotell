// ATT-GÖRA:
// [X] 1. Klass Katt: namn, chipnummer, ras, konstruktor, getters
// [X] 2. Klass KattHotell: privat lista och en dörr in
// [X] 3. Dubblettskydd på chipnummer, testas från Main
// [X] 4. Print som skriver namn, ras och chipnummer
// [X] 5. Visa när hotellet är tomt
// NYA PUNKTER FÖR PASS 2:
// [ ] 7. Sök katt på namn (eller svara tomt om den saknas)
// [ ] 8. Meny-loop som snurrar med Scanner tills vi väljer att avsluta
// [ ] 9. Koppla ihop val 1-4 med hotellet (skydda sökning i val 3 mot krasch med grindvakt)

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