
// Asal Sayı Bulabilme
// burda aslında kalanın kaç olduğunu bilmemize gerek yok amaç asallık zaten, ama btk akademide yaptırdığı için bende koydum.

public class Main {
    public static void main(String[] args) {

        int number = 0;
        boolean Prime = true;
        int remainder = number % 2;

        if (number <= 0) {
            System.out.println("Geçersiz Sayı");
            return;
        }

        if (number < 2) {
            Prime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    Prime = false;
                }
            }
        }
        if (Prime) {
            System.out.println("its prime");
            System.out.println(remainder);
        } else {
            System.out.println("its not prime");
            System.out.println(remainder);
        }

    }
}