import java.util.ArrayList;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private  CustomerType customerType;
    private int customerDiscount;
    private ArrayList<OrderItems> favoriteItems;
    private String giftCard;



    public Customer(int id, String firstName, String lastName, String email, String deliveryAddress, String customerType, String customerDiscount, ArrayList<OrderItems> favoriteItems, String giftCard)  {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = CustomerType.valueOf(customerType);
        this.customerDiscount = getCustomerDiscount();
        this.favoriteItems = favoriteItems;
        this.giftCard = giftCard;
    }

    public Customer(int id, String salman, String falah, String mail, String smeaVillage, CustomerType customerType, int i, ArrayList<OrderItems> favoriteItems, String number) {
    }

    public <E> Customer(int i, String raied, String falah, String mail, String smeaVillage, CustomerType customerType, Integer o, ArrayList<E> es, String number) {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

//    public void setCustomerType(String customerType) {
//        this.customerType = CustomerType.valueOf(customerType);
//    }

    public int getCustomerDiscount() {
        return (int) customerDiscount;
    }

    public void setCustomerDiscount(String customerDiscount) {
        this.customerDiscount = Integer.parseInt(customerDiscount);
    }

    public ArrayList<OrderItems> getFavoriteItems() {
        return favoriteItems;
    }

    public void setFavoriteItems(ArrayList<OrderItems> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

    public String getGiftCard() {
        return giftCard;
    }

    public void setGiftCard(Gift giftCard) {
        this.giftCard = giftCard.toString();
    }

    public void createFavoriteItems(OrderItems items) {
        if (!favoriteItems.contains(items)) {
            favoriteItems.add(items);
        System.out.println(items.getItemName() + " added to favorite items.");
    } else {
        System.out.println(items.getItemName() + " is already in your favorite items.");
        }
    }
    public void removeItems(OrderItems items){
        if (favoriteItems.contains(items)){
            favoriteItems.remove(items);
        }
    }

    public void takeGift(Gift gift){
        this.giftCard = gift.toString();
    }




    public  int getDiscount() throws Exception {
        customerDiscount = 0;
      CustomerType vip = CustomerType.VIP;
      CustomerType regular = CustomerType.REGULAR;
        boolean isVIPOrder = true;
        boolean isVIPType = true;

        if (isVIPOrder && isVIPType){
            getCustomerDiscount();
        }if (isVIPOrder && !isVIPType){
            throw new Exception ("Error The order is VIP, but the customer is not a VIP");
        }else {
            throw new Exception("Sorry you got no discount");

        }



    }

public void calculateTotalPrice(){
        
}













}
