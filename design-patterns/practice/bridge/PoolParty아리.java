package bridge;

public class PoolParty아리 implements Champion {
    @Override
    public void move() {
        System.out.println("Pool party move");
    }

    @Override
    public void skillQ() {
        System.out.println("Pool party skillQ");
    }

    @Override
    public void skillW() {
        System.out.println("Pool party skillW");
    }

    @Override
    public void skillE() {
        System.out.println("Pool party skillE");
    }

    @Override
    public void skillR() {
        System.out.println("Pool party skillR");
    }

    @Override
    public String getName() {
        return "아리";
    }
}
