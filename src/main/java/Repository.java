public class Repository {

    private Ticket[] ticket = new Ticket[0];


    public void save(Ticket tick) {
        Ticket[] tmp = new Ticket[ticket.length + 1];
        for (int i = 0; i < ticket.length; i++) {
            tmp[i] = ticket[i];
        }
        tmp[ticket.length] = tick;
        ticket = tmp;
    }

    public void delete(int id) {
        Ticket[] tmp = new Ticket[ticket.length - 1];
        int numberOfPositionWithoutId = 0;
        for (Ticket each : ticket) {
            if (each.getId() != id) {
                tmp[numberOfPositionWithoutId] = each;
                numberOfPositionWithoutId++;
            }
        }
        ticket = tmp;
    }

    public Ticket[] find() {
        return ticket;
    }


}
