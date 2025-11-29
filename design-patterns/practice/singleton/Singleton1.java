package singleton;

public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    // >> 2번 쓰레드 대기
    public static synchronized Singleton1 getInstance() {
        // >> 1번 쓰레드 도착
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
