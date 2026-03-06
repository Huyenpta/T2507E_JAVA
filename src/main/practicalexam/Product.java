package main.practicalexam;

public class Product {
    private Integer id;
    private String name;
    private String thumbnail;
    private Double price;
    private Integer qty;
    private String description;

    public Product() {
        id = 0;
        name = "";
        thumbnail = "";
        price = 0.0;
        qty = 0;
        description = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Description: " + description);
    }

    public boolean checkAvailability(int orderQty){
        return orderQty > 0 && orderQty <= qty;
    }

    public double placeOrder(int orderQty){

        if(checkAvailability(orderQty)){
            qty = qty - orderQty;
            return orderQty * price;
        }

        return 0;
    }

}
