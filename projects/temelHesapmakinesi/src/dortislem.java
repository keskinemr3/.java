
// Basit bi hesap makinesi
// böyle olunca main çok dolu olmuyor ya
// eskiden scanner diye bişey öğrenmiştim ama onu nasıl buraya getireceğim konusunda biraz kafam karışıyor
// en iyisi btknın yaptığı ile bırakmak

public class dortislem {

    public int topla(int sayi1, int sayi2){
        int sayi3 = sayi1 + sayi2;
        System.out.println(sayi3);
        return sayi3;
    }

    public int cikar(int sayi1, int sayi2, int sayi3){
        sayi3 = sayi1-sayi2;
        System.out.println(sayi3);
        return sayi3;

    }

    public int carp(int sayi1, int sayi2, int sayi3){
        sayi3 = sayi1*sayi2;
        System.out.println(sayi3);
        return sayi3;
    }

    public int bol(int sayi1, int sayi2, int sayi3){
        sayi3 = sayi1/sayi2;
        System.out.println(sayi3);
        return sayi3;
    }

}
