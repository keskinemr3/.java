
// Classlar arası attribute bişeyler işte
// burası main kontrol yeri ama çok saçma bunun her attribute liste şeklinde olması daha mantıklı değilmİ??
// btk şimdilik burda laptop kullanmış ama gerçek bi data storelamak istiyorsan liste kullanırsın
// benimkinde sahte bi liste varmış gibisinden
// nasıl liste yapacağımı bir türlü anlayamadım oyüzden yapmadım
// yada git sap sistemlerinin MM ini kullan

public class Main{
    public static void main(String[] args){

        Product product = new Product();

        ProductManager productmanager = new ProductManager();

        productmanager.Add(product, 3, "Laptop", 101, 4000);
        productmanager.Remove(product, 1, "Mouse", 123, 450);


    }
}