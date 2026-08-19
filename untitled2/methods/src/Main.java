
// Metodlar
// zaten hafif biliyodum btkdanda öğrenelim bari
// camel casing: birinci kelime küçük, 2 kelime büyük harfle başlar metodlarda

public class Main {

    public static void main(String[] args) {



        numberFounder();



    }

    public static void numberFounder() {

        int[] numbers = new int[]{1, 2, 5, 6, 7, 9, 0};
        int search = 1;
        boolean found = false;

        for (int number : numbers) {
            if (number == search) {
                found = true;
                break;
            }
        }

        isFound(found, search);

    }

    public static void giveMessage(String message){
        System.out.println(message);
    }

    public static void isFound(boolean check, int searching){
        if (check == true) {
            giveMessage("Sayı Bulundu: " + searching);
        } else {
            giveMessage("Sayı Bulunamadı");
        }
    }

}