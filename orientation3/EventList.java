import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> eventList;

    public EventList() {
        eventList = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        eventList.add(event);
    }

    public Event removeNextEvent() {
        return eventList.poll();
    }

    public boolean isEmpty() {
        return eventList.isEmpty();
    }

    public void printEvents() {
        for (Event event : eventList) {
            System.out.println(event);
        }
    }

    public void printOrderedEvents() {
        PriorityQueue<Event> copy = new PriorityQueue<>(eventList);

        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }
    }
}