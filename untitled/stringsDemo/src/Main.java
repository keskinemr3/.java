
// Strings Testinggg
// bunda yapay zekadan ders alarak metot yapmayı öğrendim bir nevi
// bence gayet güzel oldu
// btkda bulamazsın mesela


public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel, değil mi?";
        yazdir(mesaj);

        yazdir("Eleman sayısı: " + mesaj.length());

        yazdir("7.Eleman: " + mesaj.charAt(6));

        yazdir(mesaj.startsWith("B"));

        yazdir(mesaj.endsWith("A"));

        char[] karakterler = new char[mesaj.length()];
        mesaj.getChars(0, 31, karakterler, 0);
        yazdir(new String(karakterler));

        yazdir(mesaj.indexOf('a'));

        yazdir(mesaj.lastIndexOf('a'));

        yazdir(mesaj.replace(' ', '-'));

        yazdir(mesaj.substring(2, 5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);

        }
        yazdir("");

        yazdir(mesaj.toLowerCase());
    }

    public static void yazdir(Object veri) {
        System.out.println(veri);
        System.out.println("____________________________________");
    }
}
