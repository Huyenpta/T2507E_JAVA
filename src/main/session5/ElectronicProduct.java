package main.session5;

public class ElectronicProduct extends Product{
    private int warrantyMonths;

    public ElectronicProduct(String productId, String name, Double price, int warrantyMonths) {
        super(productId, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public String getInfo(){
        return "Mã sản phẩm: " + getProductId() + ", Tên: " + getName() + ", Giá: " +getPrice() + ", Số tháng bảo hành: " + getWarrantyMonths();
    }

    public Double calculateDiscountedPrice(){
        if (getPrice()>10000000) {
            return getPrice() * 0.9 ;
        } else {
            return getPrice();
        }
    }
}
