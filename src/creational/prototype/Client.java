package creational.prototype;

public class Client {
    public static void main(String[] args) {
        ItemRegistry registry = new ItemRegistry();
        Book myBook = registry.createBasicBook();
//        myBook.setTitle("Custom Title");
//        myBook.setPrice(15.97);

        System.out.println(myBook.getTitle());
        System.out.println(myBook.getPrice());


        CD myCD = registry.createBasicCD();
        System.out.println(myCD.getTitle());
        System.out.println(myCD.getPrice());

        //etc
    }
}
