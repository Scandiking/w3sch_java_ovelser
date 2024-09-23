public class WhileLoop {
    public static void main(String[] args) {
        // Tilordne verdien 0 til variabelen i som har blitt deklarert som integer-datatype:
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            // Når man printer ut uten at
            // i blir ++ vil man få endless
            // loop av 0-printing.
            // Vi kan øke i med 1 for hver
            // print ved å legge til
            i++;
            // Nå øker i med 1 til den når
            // 4 (indeks 5) fordi hver print
            // gjør at i får +1, altså
            // i = 0
            // (i++) => i = i + 1
            // i = 1
            // (i++) => i = i + 1
            // i = 2
            // (i++) => i = i + 1
            // i = 3
            // (i++) => i = i + 1
            // i = 4
            // Slutter å printe ved 4 fordi
            // programmet har blitt bedt om
            // å printe når (i < 5).
        }
    }
}
