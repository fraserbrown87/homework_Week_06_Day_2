import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Stock> books;

    public Library(String inputName){
        this.name = inputName;
        this.books = new ArrayList<>();
    }

    public int stockCount(){
        return this.books.size();
    }

    public void add(Stock myStock) {
        this.books.add(myStock);
    }

    public void remove() {
        this.books.remove(0);
    }
}
