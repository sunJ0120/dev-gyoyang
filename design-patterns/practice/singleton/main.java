import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import singleton.Singleton1;
import singleton.Singleton2;
import singleton.Singleton3;
import singleton.Singleton4;
import singleton.Singleton5;

public class main {
    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();

        System.out.println(s1 == s2);   // true

        Constructor<Singleton4> declaredConstructor = Singleton4.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton4 s3 = declaredConstructor.newInstance();

        System.out.println(s1 == s3);    // false

        // 리플렉션으로 싱글톤 우회하기 + enum
        Singleton5 enum1 = Singleton5.INSTANCE;
        Constructor<Singleton5> declaredConstructorEnum = Singleton5.class
                .getDeclaredConstructor(String.class, int.class);
        declaredConstructorEnum.setAccessible(true);
        Singleton5 enum2 = declaredConstructorEnum.newInstance("HACKED", 1);

        System.out.println(enum1 == enum2);
    }
}