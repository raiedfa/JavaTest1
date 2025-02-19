import java.util.ArrayList;

public class RegularOrder extends Order {
    public RegularOrder(int id, String name, String paymentType, String orderDate, double totalPrice, Customer customer, ArrayList<OrderItems> orderItems, String deliveryAddress) {
        super(id, name, paymentType, orderDate, totalPrice, customer, orderItems, deliveryAddress);
    }


}
