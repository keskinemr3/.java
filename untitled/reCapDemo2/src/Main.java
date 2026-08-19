
// bu aslında ilk projem gibi bişey, btkdakiyle aynı değil.
// deneme yanılmanın ilk denemesinde her istediğimi tutturdum.
// oley

public class Main{

    public static void main(String[] args){

        double[] myList = new double[4];
        double total = 0;
        double max = myList[3];
        myList[0] = 1.2;
        myList[1] = 1.3;
        myList[2] = 1.4;
        myList[3] = 1.5;
        for(double list:myList){
            if(max < list) {
                max = list;
            } else {
                max = max;
            }
            total = total + list;
            System.out.println("Liste: " + list);
        }
        System.out.println("En büyük: "+ max);
        System.out.println("Toplam: " + total);



    }
}