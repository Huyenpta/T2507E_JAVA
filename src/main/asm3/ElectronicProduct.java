package main.asm3;

public class ElectronicProduct extends Product{
    private Integer warrantyMonths;

    public ElectronicProduct(String productId, String name, Double price, Integer warrantyMonths) {
        super(productId, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public Integer getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(Integer warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getinfo() {
        return super.getinfo() + "Số tháng bảo hành" + getWarrantyMonths();
    }

    @Override
    public Double calculateDiscountedPrice() {
        if (getPrice()>=10000000){
            return getPrice()*0.9;
        } else {
            return getPrice();
        }
    }
}
