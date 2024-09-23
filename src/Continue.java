public class Continue {
    public static void main(String[] args) {
        // i = 0, men øk i med en gang for hver print så lenge i er mindre enn 10
        for (int i = 0; i < 10; i++) {

            // men hvis i er lik 4, fortsett med NESTE iterasjon i løkka
            if (i == 4) {
                continue;
            }

            // Kontrollprint. Legg merke til at 4 ikke printes fordi condition er at
            // om i == 4 fortsetter løkken.
            System.out.println(i);
        }
    }
}
