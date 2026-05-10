public class OrientationTask3_6 {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        clock.setTime(0);

        EventList eventList = new EventList();

        ArrivalProcess arrivalProcess =
                new ArrivalProcess(EventType.ARRIVAL, 4);

        for (int i = 0; i < 10; i++) {
            arrivalProcess.generateNextEvent(eventList);
        }

        System.out.println("Clock time after last event: " + clock.getTime());

        System.out.println("\nEvent list:");
        eventList.printEvents();
    }
}