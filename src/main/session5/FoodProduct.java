package main.session5;

public class FoodProduct extends Product{
    private int expiryDays;

    public FoodProduct(String productId, String name, Double price, int expiryDays) {
        super(productId, name, price);
        this.expiryDays = expiryDays;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }

    public String getInfo(){
        return "Mã sản phẩm: " + getProductId() + ", Tên: " + getName() + ", Giá: " + getPrice() + "Số ngày còn lại trước hạn sử dụng:" + getExpiryDays();
    }

    public Double calculateDiscountedPrice(){
        if (getExpiryDays() <= 3) {
            return getPrice() * 0.7 ;
        } else {
            if (getExpiryDays() <= 7){
                return getPrice() * 0.3 ;
            } else {
                return getPrice();
            }
        }
    }
}
