import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockTest {

    Stock myStock;
    Book dune;

    @Before
    public void before(){
        myStock = new Stock( 10);
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, myStock.booksCount());
    }

    @Test
    public void addBooks(){
        myStock.addBooks(dune);
        assertEquals(1, myStock.booksCount());
    }

    @Test
    public void canRemoveBooks(){
        myStock.addBooks(dune);
        myStock.removeBooks();
        assertEquals(0, myStock.booksCount());
    }
}
