
// arrays?? hee, Diziler.
// burda 3 yöntem var aynı şeyi yapabilmem için, en "ergonomik" olanı en aşağıda.
// neye göre kime göre ergonomik hiç sormayın, bilmiyorum çünkü. daha kısa işte. yoo gayet aynı uzunlukta, lan banane nasıl yapıyorsan yap Allah Allahhh, kendi kendime sinirlendim ya.

public class Main{
    public static void main(String[] args){

        // ------------------------------------------

        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Emre";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        // ------------------------------------------

        System.out.println("-------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Emre";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        // ------------------------------------------

        System.out.println("-----------------");

        String[] ogr = new String[4];
        ogr[0] = "Engin";
        ogr[1] = "Derin";
        ogr[2] = "Salih";
        ogr[3] = "Emre";

        for(String ogrenci:ogr){
            System.out.println(ogrenci);
        }
    }
}