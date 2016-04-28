import static org.junit.Assert.*;

/**
 * Created by Marc on 28.04.2016.
 */
public class CustomerTest {

    Movie m1;
    Movie m2;
    Rental r1;
    Rental r2;
    Customer c1;
    String result;


    @org.junit.Before
    public void setUp() throws Exception {

        m1 = new Movie("movie1", 1);
        m2 = new Movie("movie2", 2);
        r1 = new Rental(m1, 10);
        r2 = new Rental(m2, 5);
        c1 = new Customer("joe");
        c1.addRental(r1);
        c1.addRental(r2);
        result = c1.statement();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testStatement() throws Exception {
        assertEquals("Rental Record for joe\n\tTitle\t\tDays\tAmount\n\tmovie1\t\t10\t30.0\n\tmovie2\t\t5\t4.5\nAmount owed is 34.5\nYou earned 3 frequent renter points", result);
    }
}