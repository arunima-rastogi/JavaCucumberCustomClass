package js284;

/**
 * Ticket
 */
public class Ticket {

    String Dest;
    double Price;

    public Ticket(String _dest) {
        this.Dest = _dest;
        this.Price = 10.0;
    }

    /**
     * @return the dest
     */
    public String getDest() {
        return Dest;
    }
    /**
     * @return the price
     */
    public double getPrice() {
        return Price;
    }
}