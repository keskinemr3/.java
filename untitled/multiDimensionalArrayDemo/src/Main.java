
// Diziler.
// ama daha versiyonlusu
// hepsinin adı istanbul ama farklılar yani.
// neyse düzelttim.

public class Main {
    public static void main(String[] args){
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Kayseri";
        sehirler[0][2] = "GİRESUN";
        sehirler[1][0] = "Hatay";
        sehirler[1][1] = "Ankara";
        sehirler[1][2] = "Afyonkarahisar";
        sehirler[2][0] = "Rize";
        sehirler[2][1] = "Erzincan";
        sehirler[2][2] = "İzmir";
        for(int i = 0; i <= 2; i++){
            System.out.println("-------------");
            for(int j = 0; j <= 2; j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
