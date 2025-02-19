public class OrderItems {
    private int id;
    private String itemName;
    private double itemPrice;

    public OrderItems(int id, double itemPrice, String itemName) {
        this.id = id;
        this.itemPrice = itemPrice;
        this.itemName = itemName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }


}
