package factory;

public class Client {
    public static void main(String[] args) {
        ShipPartsFactory whiteShipPartsFactory = new WhiteShipPartsFactory();

        Ship whiteship = new WhiteShipFactory(whiteShipPartsFactory).orderShip("WhiteShip", "keesun@mail.com");
        System.out.println(whiteship);

//        Ship blackship = new BlackShipFactory().orderShip("BlackShip", "keesun@mail.com");
//        System.out.println(blackship);
    }
}
