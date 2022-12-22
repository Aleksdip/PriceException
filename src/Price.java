public class Price {
    String name;
    String shop;
    String price;

    public Price(String name, String shop, String price) {
        this.name = name;
        this.shop = shop;
        this.price = price;
    }

    public String getShop() {
        return shop;
    }
    public String toString() {
        return "Product name = " + name + ", Shop name = " + shop + ", Price = " + price + "grn";
    }
}
