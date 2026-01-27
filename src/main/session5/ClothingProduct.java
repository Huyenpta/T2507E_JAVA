package main.session5;

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

    public String getInfo(){
        return "Mã sản phẩm: " + getProductId() + ", Tên: " + getName() + ", Giá: " + getPrice() + ", Kích thước: " +getSize();
    }

    public Double calculateDiscountedPrice(){
        return getPrice() * 0.85 ;
    }


}
