
// Mükemmel Sayı.
// artık yazdığım projeler direkt void main ile çünkü daha kısa ve ergonomik ve neden olmasın
// tabi yazdığım o uzun public static void bilmem nesinide hatırlıyorum ama böyle daha hızlı

void main (){
    int number = 5;
    int total = 0;

    for(int i = 1; i < number; i++){
        if(number % i == 0){
            total = total + i;
        }
    }
    if(total == number){
        System.out.println("Mükemmel Sayı");
    } else {
        System.out.println("Mükemmel Sayı Değildir");
    }
}