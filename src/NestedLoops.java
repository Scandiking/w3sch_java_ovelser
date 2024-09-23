// Løkke i løkke eller...:
public class NestedLoops {
    public static void main(String[] args) {
        // Ytre løkke
        for (int i = 1; i <= 2; i++) {
            // Kjører to ganger fordi i = 1 og øker med 1 for hver gang
            // og i = i +1 = 2, altså printes ytre 1 og ytre 2
            System.out.println("Ytre: " + i);

        // Indre løkke
            for (int j = 1; j <= 3; j++) {
                // Kjøres 3 ganger (j = 1, j = j+1 (altså 2), j = j+1 (altså 3)
                // for hver gang i er mindre enn eller lik 3
                System.out.println(" Indre: " + j);
            }
        }
        // Ytre løkke kjører to ganger. Den første gangen kjører den først seg selv (ytre løkke) og deretter
        // indre løkke som nevnt antall ganger (3) før den starter med neste for-iterasjon (nr2) og påfølgende
        // indre løkke-printer.
    }
}
