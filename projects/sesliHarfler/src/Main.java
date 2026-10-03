/*
public class Main {
    public static void main(String[] args) {
        char harf = 'Z';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }
    }
} */

// üstteki neden yetersiz?
// çünkü sessiz bi harf koysan makina bozulur.
// böylesi daha iyi:

void main() {
    char harf = 'J';
    char[] kalin = {'A', 'I', 'U', 'O'};
    char[] ince = {'E', 'İ', 'Ü', 'Ö'};

    boolean kalinMi = false;
    boolean inceMi = false;

    for (char k : kalin) {
        if (k == harf) {
            kalinMi = true;
            break;
        }
    }

    for (char i : ince) {
        if (i == harf) {
            inceMi = true;
            break;
        }
    }

    if (kalinMi) {
        System.out.println("Bu harf kalın sesli");
    } else if (inceMi) {
        System.out.println("Bu harf ince sesli");
    } else {
        System.out.println("Bu harf sessiz");
    }

}