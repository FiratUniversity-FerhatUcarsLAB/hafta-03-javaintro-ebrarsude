public class BMICalculator {
    public static void main(String[] args) {
       
        double boy = 164;
        double kilo = 53; 

        double boyMetre = boy / 100;

       
        double bmi = kilo / (boyMetre * boyMetre);

      
        System.out.printf("Boy: %.2f m\n", boyMetre);
        System.out.println("Kilo: " + kilo + " kg");
        System.out.printf("VUcut Kitle ındeksi (BMI): %.2f\n", bmi);
    }
}
