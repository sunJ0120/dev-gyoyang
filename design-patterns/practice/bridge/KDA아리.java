package bridge;

public class KDA아리 implements Champion{
    @Override
    public void move() {
        System.out.println("KDA아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA skillQ");
    }

    @Override
    public void skillW() {
        System.out.println("KDA skillW");
    }

    @Override
    public void skillE() {
        System.out.println("KDA skillE");
    }

    @Override
    public void skillR() {
        System.out.println("KDA skillR");
    }

    @Override
    public String getName() {
        return "KDA아리";
    }
}
