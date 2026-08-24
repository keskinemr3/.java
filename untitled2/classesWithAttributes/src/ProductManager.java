
// Ürünlerin üzerinde oynama falan
// Yine mainde dediğim gibi burda bi liste ve o listeye burdan karışabilmem lazım
// get set diye bi ders var onuda izleyeyim belki dediklerimi yapıyordur isimden tahmin edecekisem
// burası btk ile aynı değil ben data return etsin diye voidden string yaptım
// added yaptığını sadece konsola yazdırsam ne yazar

// get set herşeyi öğrendim btk tamamen farklı bişey yapıyor bende böyle yaptım çünkü neden olmasın
// claude baba herşeyi anlattı bizde yaptık cansın claude



public class ProductManager {

    public String Add(Product product, int amount, String brand, int id, int price){
        product.setStockAmount(product.getStockAmount() + amount);
        product.setName(product.getName() + brand);
        product.setId(product.getId() + id);
        product.setPrice(product.getPrice() + price);
        String added = "Ürün Eklendi | " + brand + " | " + amount + " | " + id + " | " + price;
        System.out.println(added);
        return added;
    }
    public String Remove(Product product, int amount, String brand, int id, int price){
        product.setStockAmount(product.getStockAmount() - amount);
        product.setName(product.getName() + brand);
        product.setId(product.getId() + id);
        product.setPrice(product.getPrice() + price);
        String removed = "Ürün Çıkarıldı | " + brand + " | " + amount + " | " + id + " | " + price;
        System.out.println(removed);
        return removed;
    }

}
