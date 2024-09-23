public class Multiplication {
    public static void main(String[] args) {

        // x-gangen du vil se "gangeren" til
        int number = 7; // betyr "syvgangeren"

        /*
        print number x i = (number x i) for hver gang
        i >= 1 men <= 10, altså om number = 5 så får vi
        5 + " x " + i (som nå er 1) = (5 x 1) som blir fem
        Neste print blir da 5 + " x " + i som nå har økt med 1 pga ++1 og blir da
        5 + " x " + i (5 + " x " + 2) som da blir 5 x 2 osv.
        Altså øker i med 1 for hver print til i <= 10.
        */

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
