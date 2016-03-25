package entities;


public class Purchase {

    private Forfaits forfait;
    private String creditCard;

    public Forfaits getForfait() { return forfait; }
    public String getCreditCard() { return creditCard; }


    public Purchase(Forfaits forfait, String creditCard) {
        this.forfait = forfait;
        this.creditCard = creditCard;
    }
}
