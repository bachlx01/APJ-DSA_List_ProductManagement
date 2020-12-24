public class Product implements Comparable<Product>{
    private String ID;
    private String name;
    private int price;

    public Product(String ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    // Getters

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // Setters

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + this.ID + "; Name: " + this.name + "; Price: " + this.price;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
