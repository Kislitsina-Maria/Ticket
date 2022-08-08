import java.util.Arrays;

public class Manager {
    Repository repo = new Repository();

    public void addTicket(Ticket ticket) {
        repo.save(ticket);
    }

    public Ticket[] findAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket each : repo.find()) {
            if (each.getDeparture() == from && each.getArrival() == to) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[result.length] = each;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }
}
