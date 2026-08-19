
// Sayı Bulma
// bunu kendim yaptım
// ilk 2 satır btkdan diğeri benim
// luau öğrenmem lazım ya
// bir oyun fikri çok iyi hissettiriyor.
// zaten java öğrenmemim sebebi bir baltaya sap olabilmek veee
// minecraftta mod yapmak :ddd

void main(){
    int[] numbers = new int[]{1,2,5,6,7,9,0};
    int search = 10;
    boolean found = false;

    for(int number : numbers){
        if (number == search){
            found = true;
            break;
        }
    }
    if(found == true){
        System.out.println("Sayı Bulundu");
    } else {
        System.out.println("Sayı Bulunamadı");
    }
}
