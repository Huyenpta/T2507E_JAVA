package main.asm3;

public class ClothingProduct extends Product{
    private String size;

    public ClothingProduct(String productId, String name, Double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getinfo() {
        return super.getinfo()+"Size: " +getSize();
    }

    @Override
    public Double calculateDiscountedPrice() {
        return getPrice() * 85/100;
    }
}
