import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    Repository repo = new Repository();
    Ticket ticket1 = new Ticket(1, 2344, "tgg", "YYY", 566);
    Ticket ticket2 = new Ticket(2, 66767, "TTT", "YYY", 4563);
    Ticket ticket3 = new Ticket(3, 234, "FFF", "HJH", 45630);

    @BeforeEach
    public void addTicket() {
        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);
    }

    @Test
    public void findAllTicket() {
        Ticket[] expected = {ticket1, ticket2, ticket3};
        Ticket[] actual = repo.find();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void deleteId() {
        repo.delete(2);
        Ticket[] expected = {ticket1, ticket3};
        Ticket[] actual = repo.find();
        Assertions.assertArrayEquals(expected, actual);
    }
}
