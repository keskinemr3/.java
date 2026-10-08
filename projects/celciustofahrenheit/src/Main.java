import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a celcius degree: ");
        int degree = scanner.nextInt();

        double carp = 1.8;
        int ekle = 32;

        System.out.println("your degree in fahrenheit is; " + (degree * carp + ekle));
    }
}