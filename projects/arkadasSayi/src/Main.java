
// Arkadaş Sayı
// sayı 1 diyelimki 220, 220nin kaç bölen varsa hepsini topluyorsun (kendisi sayılmıyor)
// bu sayıları toplarsak 284 çıkıyor, 284ün bölenlerini topla
// 220 çıkıyor. bu iki sayıda birbirini çıkardığı için arkadaş sayı olarak sayılıyor.
// eğer hala anlamadım diyorsanda: Kendi hariç bölenlerinin toplamı birbirini veren iki sayının bölenleri birbirini tamamladığı için arkadaş sayıdır.

void main(){
    int number1 = 220;
    int number2 = 284;
    int total1 = 0;
    int total2 = 0;

    for (int i = 1; i < number1; i++){
        if(number1 % i == 0){
            total1 = total1 + i;
        }
    }
    for (int i = 1; i < number2; i++){
        if(number2 % i == 0){
            total2 = total2 + i;
        }
    }
    if(number1 == total2 && number2 == total1){
        System.out.println("bu iki sayı arkadaştır");
    } else {
        System.out.println("bu iki sayı arkadaş değildir");
    }
}