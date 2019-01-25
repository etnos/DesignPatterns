package behavioral.visitor2;

public class PostageVisitor implements Visitor {
    private double totalPostageForCart;

    //collect data about the book
    public void visit(Book book) {
        //assume we have a calculation here related to weight and price
        //free postage for a book over 10
        if (book.getPrice() > 10.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    //add other visitors here
    public void visit(CD cd) {
        if (cd.getPrice() > 2.0) {
            totalPostageForCart += cd.getWeight() * 3;
        }
    }

    public void visit(DVD dvd) {
        if (dvd.getPrice() > 5.0) {
            totalPostageForCart += dvd.getWeight() * 20;
        }
    }

    //return the internal state
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}
