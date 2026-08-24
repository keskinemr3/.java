
// Ürün hakkındaki bilgileri tanımlıyor
// Ana attribute burası zaten
// field mantığını tam anlamadım araştırcam
// burayı direkt tüm variable koyup maine aktarma olayı baya iyiymiş bende bunu arıyordum zaten
// burayıda aynen bi saat get set anlatıyordu bok gibi bende direkt kavradığım gibi yazdım
// anlatana laf yokda, lafı çok dolandırıyor

public class Product {

    // attribute | field
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
