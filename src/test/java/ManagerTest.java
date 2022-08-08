import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    Manager manager = new Manager();
    Ticket ticket1 = new Ticket(1, 2344, "tgg", "YYY", 566);
    Ticket ticket2 = new Ticket(2, 66767, "TTT", "YYY", 4563);
    Ticket ticket3 = new Ticket(3, 234, "FFF", "HJH", 45630);
    Ticket ticket4 = new Ticket(2, 27, "TTT", "YYY", 4563);
    Ticket ticket5 = new Ticket(2, 667, "TTT", "YYY", 4563);

    @BeforeEach
    public void addTicket() {
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);
        manager.addTicket(ticket5);
    }

    @Test
    public void findAllTicket() {
        Ticket[] expected = {ticket4, ticket5, ticket2};
        Ticket[] actual = manager.findAll("TTT", "YYY");
        Assertions.assertArrayEquals(expected, actual);
    }
}