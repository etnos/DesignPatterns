package creational.prototype;

//Prototype
public abstract class Item implements Cloneable {
    private String title;
    private double price;

    @Override
    public Item clone() {
        Item clonedItem = null;
        try {
            //use default object clone.
            clonedItem = (Item) super.clone();
            //specialised clone
//            clonedItem.setPrice(price);
//            clonedItem.setTitle(title);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch
        return clonedItem;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
