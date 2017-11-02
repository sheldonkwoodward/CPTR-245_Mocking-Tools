// Sheldon Woodward
// Cameron Smith
// Homework 6
// CPTR 245
// 11/2/17

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PortfolioTest {
    private Portfolio pf;

    @Before
    public void setUp() {
        // portfolio
        pf = new Portfolio();
    }

    @Test
    public void testBuyStock() {
        // mock stock service
        StockService mockStockService = EasyMock.createMock(StockService.class);
        pf.setStockService(mockStockService);
        EasyMock.expect(mockStockService.purchase("TSLA", 32)).andStubReturn(new Stock("0", "TSLA", 32));
        EasyMock.replay(mockStockService);

        // buy stock
        pf.buyStock("TSLA", 32);
        ArrayList<Stock> actual = pf.getStock("TSLA");
        ArrayList<Stock> expected = new ArrayList<Stock>() {{ add(new Stock("0", "TSLA", 32)); }};

        // verify mock
        EasyMock.verify(mockStockService);

        // assertions
        assertEquals(actual.size(), expected.size());
        assertEquals(actual.get(0), expected.get(0));
    }
}