import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PortfolioTest {
    private Portfolio pf;
    private ArrayList<Stock> sl;

    @Before
    public void setUp() {
        // portfolio
        pf = new Portfolio();

        // mock stock service
        // TODO: mock stock service

        // sample stocks
        sl = new ArrayList<>();
        sl.add(new Stock("1", "GOOG", 12));
        sl.add(new Stock("2", "AAPL", 4));
    }

    @Test
    public void testBuyStock() {
        pf.buyStock("TSLA", 32);
        ArrayList<Stock> actual = pf.getStock("TSLA");
        ArrayList<Stock> expected = new ArrayList<>();
        expected.add(new Stock("0", "TSLA", 32));

        assertEquals(expected, actual);
    }

    @Test
    public void testSellStock() {

    }
}