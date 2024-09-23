public class Break {
    public static void main(String[] args) {

        // For hver print øk i med 0 så lenge i er under 100
        for (int i = 0; i < 100; i++) {

            // Hopp ut av loopen om i er lik 51
            if (i == 51) {
                break;
            }

            // Kontrollprint
            System.out.println(i);
        }
    }
}
