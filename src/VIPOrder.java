import java.util.ArrayList;

public class VIPOrder extends Order{
    public VIPOrder(int id, String name, String paymentType, String orderDate, double totalPrice, Customer customer, ArrayList<OrderItems> orderItems, String deliveryAddress) {
        super(id, name, paymentType, orderDate, totalPrice, customer, orderItems, deliveryAddress);

    }
    private double calculateTotalPriceWithDiscount() throws Exception {
        return super.calculateTotalPrice() - getDiscount();
    }
}
