import singleton.Singleton1;
import singleton.Singleton2;
import singleton.Singleton3;

public class main {
    public static void main(String[] args) {
        Singleton3 s1 = Singleton3.getInstance();
        Singleton3 s2 = Singleton3.getInstance();

        System.out.println(s1 == s2);    // true
    }
}