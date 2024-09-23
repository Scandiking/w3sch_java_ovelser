public class Array {
    public static void main(String[] args) {

        // Opprette string-array kalt cars
        // Populere array med elementer
        String[] cars = {"Volvo 740 SE", "Volvo 240", "Volvo 940", "Volvo V70", "Volvo V60", "Volvo S50", "Volvo XC90"};

        // Aksessere fjerde element (tredje indeks) i array
        System.out.println(cars[3]);

        // Endre verdi av spesifikt element
        // Kontrollprint før
        System.out.println("Før:   "+cars[0]);
        // Utføre endringen
        cars[0] = "Volvo 740";
        // Kontrollprint etter
        System.out.println("Etter: "+cars[0]);

        // Lengde på array vha "length"
        // gir lengde i antall elementer
        System.out.println("Antall biler i " + cars + " er "+cars.length);
    }
}
