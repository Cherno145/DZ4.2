public class Main {
    public static void main(String[] args) {
        bodyMassIndex service = new bodyMassIndex();
        int weightInKg = 98;
        double heightInMeters = 1.87;
        int bmi = service.calculate( weightInKg, heightInMeters); //
        System.out.println(bmi);
    }
}