import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static  void main(String[] args)  {
        try {


            OrderItems item1 = new OrderItems(123, 1000, "Laptop");
            OrderItems item2 = new OrderItems(456, 3000, "Iphone");
            OrderItems item3 = new OrderItems(789,4000,"TV");

            Customer regularCustomer = new Customer(369852, "Raied", "Falah", "raied@gmail.com", "Smea Village", CustomerType.REGULAR, null, new ArrayList<>(), "200");

            Customer vipCustomer = new Customer(456789, "Salman", "Falah", "salman@gmail.com", "Smea Village", CustomerType.VIP, 350, new ArrayList<>(), "200");

            RegularOrder order1 = new RegularOrder(555555,"order1","CASH","29/01/2025",0,regularCustomer,new ArrayList<OrderItems>(),"Smea Village");
            VIPOrder order2 = new VIPOrder(6666666,"order2","CASH","29/01/2025",0,regularCustomer,new ArrayList<OrderItems>(),"Smea Village");


            System.out.println("order1 total price:" + order1.getTotalPrice());
            System.out.println("order2 total price:" + order2.getTotalPrice());














        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
