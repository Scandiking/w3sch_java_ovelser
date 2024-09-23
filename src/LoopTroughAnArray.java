public class LoopTroughAnArray {
    public static void main(String[] args) {
        // Opprette arrayet cars
        // og populere med elementer
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Lengde på cars-array: "+cars.length);

        // Så lenge verdien i bilObjekt ikke er større enn lengden på arrayet cars
        // print verdien i indeksen til arrayet car og øk bilObjekt-variabel med 1
        // Altså er bilObjekt indeks 0 Volvo og cars.length er 4 (0, 1, 2, 3)
        // første bilObjekt i cars-array er Volvo, neste er BMW osv.
        for (int bilObjekt = 0; bilObjekt < cars.length; bilObjekt++) {

            System.out.println(cars[bilObjekt]);
        }
    }
}
