public class ASCIIHarfi {
    public static void main(String[] args) {
        // Baş harf
        char harf = 'E';

        System.out.println("ASCII Art ile '" + harf + "' harfi:");
        System.out.println();

        switch(harf) {
            case 'E':
                System.out.println(" EEEEE ");
                System.out.println(" E     ");
                System.out.println(" E     ");
                System.out.println(" EEEEE ");
                System.out.println(" E     ");
                System.out.println(" E     ");
                System.out.println(" EEEEE ");
                break;

            default:
                System.out.println("ASCII Art henüz bu harf için tanımlanmadı.");
        }
    }
}
