package main.asm3;

public class FoodProduct extends Product{
    private Integer expiryDays;

    public FoodProduct(String productId, String name, Double price, Integer expiryDays) {
        super(productId, name, price);
        this.expiryDays = expiryDays;
    }

    public Integer getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(Integer expiryDays) {
        this.expiryDays = expiryDays;
    }

    @Override
    public String getinfo() {
        return super.getinfo() + "Số ngày còn lại trước hạn sử dụng: " + getExpiryDays();
    }

    @Override
    public Double calculateDiscountedPrice() {
        if (getExpiryDays() <= 3) {
            return getPrice() * 0.7;
        } else {
            if (getExpiryDays() <= 7) {
                return getPrice() * 0.9;
            }
        } return getPrice();
    }
}
