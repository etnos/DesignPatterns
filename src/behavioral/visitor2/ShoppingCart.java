package behavioral.visitor2;

import java.util.ArrayList;

public class ShoppingCart {
    //normal shopping cart stuff
    private ArrayList<Visitable> items = new ArrayList<>();

    public double calculatePostage() {
        //create a visitor
        PostageVisitor visitor = new PostageVisitor();
        //iterate through all items
        for (Visitable item : items) {
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostage();
        return postage;
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.items.add(new Book(40, 5));
        shoppingCart.items.add(new Book(10, 1));
        shoppingCart.items.add(new CD(100, 2));
        shoppingCart.items.add(new DVD(200, 6));

        System.out.println("Total postage: " + shoppingCart.calculatePostage());
    }
}
