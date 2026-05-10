public class OrientationTask3_5 {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();

        System.out.println("Initial time: " + clock.getTime());

        clock.setTime(25.5);

        System.out.println("New time: " + clock.getTime());
    }
}