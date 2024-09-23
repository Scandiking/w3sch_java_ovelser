public class ForEachLoop {
    public static void main(String[] args) {
        // Creating string array named cars
        // adding string elements to array
        String[] cars = {
                "Volvo 740 SE",
                "BMW x3",
                "Mercedes Benz S65 AMG ",
                "Ford Transit",
                "Mazda CX-80",
                "Renault Rafale",
                "Chrysler Airflow"
        };

        // for each string element carInArray in the cars array
        for (String carInArray : cars) {
            // print the according element
            System.out.println(carInArray);
        }
    }
}
