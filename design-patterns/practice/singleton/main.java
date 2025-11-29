import singleton.Singleton1;
import singleton.Singleton2;

public class main {
    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();

        System.out.println(s1 == s2);    // true
    }
}