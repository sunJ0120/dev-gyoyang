package factory;

public class Client {
    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("WhiteShip", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("BlackShip", "keesun@mail.com");
        System.out.println(blackship);
    }
}
