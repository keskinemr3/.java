
// ana kod

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        dortislem hesap = new dortislem();

        System.out.println("first number: ");
        int sayi1 = scanner.nextInt();

        System.out.println("second number:");
        int sayi2 = scanner.nextInt();

        System.out.println("choose an arithmetic operator");
        String op = scanner.next();

        if (op.equals("addition")) {
            hesap.topla(sayi1, sayi2);
        } else if (op.equals("subtraction")) {
            hesap.cikar(sayi1, sayi2);
        } else if (op.equals("multiplication")) {
            hesap.carp(sayi1, sayi2);
        } else if (op.equals("division")) {
            hesap.bol(sayi1, sayi2);
        } else {
            System.out.println("Invalid operator!");
        }
    }
}