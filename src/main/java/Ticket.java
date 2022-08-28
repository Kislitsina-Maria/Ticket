public class Ticket implements Comparable<Ticket> {

    protected Ticket(int id, int price, String departure, String arrival, int travelTime) {
        this.id = id;
        this.price = price;
        this.departure = departure;
        this.arrival = arrival;
        this.travelTime = travelTime;
    }

    protected Ticket() {
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    private int id;

    protected int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    protected String getDeparture() {
        return departure;
    }

    protected void setDeparture(String departure) {
        this.departure = departure;
    }

    protected String getArrival() {
        return arrival;
    }

    protected void setArrival(String arrival) {
        this.arrival = arrival;
    }

    private int price;
    private String departure;
    private String arrival;
    private int travelTime;


    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        }
        if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
