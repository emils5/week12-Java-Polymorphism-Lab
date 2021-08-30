import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> purchases;

    public Wallet(String name) {
        this.name = name;
        this.purchases = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.purchases.size();
    }

    public void addItem(IScan item) {
        this.purchases.add(item);
    }
//
//    public String scan() {
//        return "Transaction completed";
//    }
}
