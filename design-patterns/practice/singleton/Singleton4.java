package singleton;

public class Singleton4 {
    private Singleton4() {
    }

    private static class Singleton4Holder {
        private static final Singleton4 SINGLETON_4 = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return Singleton4Holder.SINGLETON_4;
    }
}