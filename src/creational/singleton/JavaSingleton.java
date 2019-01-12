package creational.singleton;

public class JavaSingleton {

    private JavaSingleton() {
    }

    private static JavaSingleton instance = null;

    public static JavaSingleton getInstance() {
        if (instance == null) {
            synchronized (JavaSingleton.class) {
                if (instance == null) {
                    instance = new JavaSingleton();
                }
            }
        }

        return instance;
    }

    public void test() {
        System.out.println("I'm alive");
    }

    public static void main(String[] args) {
        JavaSingleton.getInstance().test();
    }
}
