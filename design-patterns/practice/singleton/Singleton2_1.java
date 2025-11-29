package singleton;

public class Singleton2_1 {
    private static final Singleton2_1 INSTANCE;

    static {
        try {
            INSTANCE = new Singleton2_1();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    private Singleton2_1() throws Exception {
    }

    public static Singleton2_1 getInstance() {
        return INSTANCE;
    }
}