
// Switch Testing
// şu sistem güzelim devletimde yok, daha ne olsun xddDD

public class Main {
    public static void main(String[] args) {

        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("A ile geçtin");
                break;
            case 'B':
                System.out.println("B ile geçtin");
                break;
            case 'C':
                System.out.println("C ile geçtin");
                break;
            case 'D':
                System.out.println("D ile geçtin");
                break;
            case 'F':
                System.out.println("Kaldın.");
                break;
            default:
                System.out.println("Geçersiz Not");
        }
    }
}