public class Main {
    public static void main(String[] args) {
        car Tesla = new car();
        Tesla.type_engine("electric");
        Tesla.no_of_cylinders(0);
        Tesla.type_brake("ABS");

        car Buggati = new car();
        Buggati.type_engine("Petrol");
        Buggati.no_of_cylinders(8);
        Buggati.type_brake("CBS");  // lol

        car Hyundai = new car();
        Hyundai.type_brake();
    }
}