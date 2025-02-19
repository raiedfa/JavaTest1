public class GiftCard implements  Gift{
    private int moneyAmount;

    public GiftCard(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return "GiftCard{" +
                "moneyAmount=" + moneyAmount +
                '}';
    }

    @Override
    public void openGift() {
        System.out.println("Congrats! you got a new gift! enjoy");
        moneyAmount = 0;
    }
}
