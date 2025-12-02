package builder;

public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());

        TourPlan plan1 = director.cancunTrip();
        TourPlan plan2 = director.cancunTrip();
    }
}
