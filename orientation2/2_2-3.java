public class OrientationTask2_2_3 {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.addEvent(new Event(EventType.ARRIVAL, 15));
        eventList.addEvent(new Event(EventType.EXIT, 30));
        eventList.addEvent(new Event(EventType.ARRIVAL, 5));
        eventList.addEvent(new Event(EventType.EXIT, 20));
        eventList.addEvent(new Event(EventType.ARRIVAL, 10));

        System.out.println("Events in chronological order:");
        eventList.printOrderedEvents();

        System.out.println();
        System.out.println("Next event to be processed:");
        Event nextEvent = eventList.getNextEvent();
        System.out.println(nextEvent);

        System.out.println();
        System.out.println("Events remaining in chronological order:");
        eventList.printOrderedEvents();
    }
}