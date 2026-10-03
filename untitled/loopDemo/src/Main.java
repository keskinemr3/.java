
// for, while, do while döngüleri.
// do while şeysini hala anlamadım diyebilirim.
// belki şeydir böyle n = 1, n bir bir arttır, n 10a geldiğinde anda bitir falan
// bu zaten düz for döngüsü değilmi???
// bilemedim arasındaki farkını bi araştırayım 19.51
// az önce en kısa ve mantıklı olan açıklamayı okudum ve anladım. sağolun 19.53

public class Main{
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        int s = 1;
        while (s <= 10) {
            System.out.println(s);
            s++;
        }
        System.out.println("While Döngüsü Bitti");

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 10);
        System.out.println("Do While Döngüsü Bitti");
    }
}