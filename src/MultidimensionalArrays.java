public class MultidimensionalArrays {
    public static void main(String[] args) {
        // Opprette todimensjonalt array
        // Første brackets er main array (myNumbers)
        // Andre bracketset er array-ene inni hovedarrayet
        // her f.eks {1, 2, 3, 4} som er første "element" i arrayet

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} };
        System.out.println(myNumbers[1][2]); // gir 7 fordi første bracket viser til indeks 1 i hovedarray,
        // altså 2. element i hovedarray. Andre bracket viser til indeks 2 i arrayet i hovedarrayet. Litt som fylke -> kommune.

        // Apropos det, la oss gjøre nettopp det:
        String[][] sted = {{"Meløy","Bodø","Gildeskål"}, {"Bardu","Målselv","Finnsnes"}, {"Alta","Kvænangen","Porsanger"}};

        // La oss si vi vil hente ut "Meløy". Da kjører vi:
        System.out.println(sted[0][0]);

        // Dette er første element i første array. Vil vi hente f.eks andre element i tredje array kjører vi:
        System.out.println(sted[2][1]);

        // Oppretter kontaktliste-arrayet "kontakter"
        String[][] kontakter = {
                // Populerer med elementer
                {"Ola Nordmann", "Fjellveien 1", "Hattfjelldal"},
                {"Navn Navnesen", "Osloveien 315", "Oslo"},
                {"John Doe", "Amerikaveien 0407", "Illinois"}
                };

        // Hvilken gate bor Ola i?
        System.out.println("Ola bor i "+kontakter[0][1]);

        // Hvilken kommune bor Navn i?
        System.out.println("Navn bor i "+kontakter[1][2]);

        // Hva heter han fra Illinois?
        System.out.println("Han fra"+" "+kontakter[2][2]+" "+"heter"+" "+kontakter[2][0]);
    }
}
