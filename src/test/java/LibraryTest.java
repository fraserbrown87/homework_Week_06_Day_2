import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library myLibrary;
    Book dune;
    Stock myStock;

    @Before
    public void before() {
        myLibrary = new Library("Leith Library");
        dune = new Book();
        myStock = new Stock(10);
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, myLibrary.stockCount());
    }

    @Test
    public void canAddStock(){
        myLibrary.add(myStock);
        assertEquals(1, myLibrary.stockCount());
        assertEquals(0, myStock.booksCount());
    }

    @Test
    public void canRemoveStock(){
        myLibrary.add(myStock);
        myLibrary.remove();
        assertEquals(0, myLibrary.stockCount());
    }
}
