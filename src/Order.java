import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.DoubleStream;

public   abstract class Order {
    private int id;
    private String name;
    private String deliveryAddress;
    private ArrayList<OrderItems> orderItems;
    private Customer customer;
    private double totalPrice;
    private PaymentType paymentType;
    private String orderDate;

    public Order(int id, String name, String paymentType, String orderDate, double totalPrice, Customer customer, ArrayList<OrderItems> orderItems, String deliveryAddress) {
        this.id = id;
        this.name = name;
        this.paymentType = PaymentType.valueOf(paymentType);
        this.orderDate = String.valueOf(orderDate);
        this.totalPrice = calculateTotalPrice();
        this.customer = customer;
        this.orderItems = orderItems;
        this.deliveryAddress = deliveryAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public ArrayList<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

//    public void setPaymentType(String paymentType) {
//        this.paymentType = PaymentType.valueOf(paymentType);
//    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = String.valueOf(orderDate);
    }


    public int getDiscount() throws Exception {
        CustomerType vip = CustomerType.VIP;
        CustomerType regular = CustomerType.REGULAR;
        boolean isVIPOrder = true;
        boolean isVIPType = true;

        if (isVIPOrder && isVIPType) {
            totalPrice = totalPrice - getDiscount();
        }
        if (isVIPOrder && !isVIPType) {
            throw new Exception("Error The order is VIP, but the customer is not a VIP");
        } else {
            throw new Exception("Sorry you got no discount");

        }
    }





}
