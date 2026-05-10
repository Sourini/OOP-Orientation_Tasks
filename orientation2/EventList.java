import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> eventList;

    public EventList() {
        eventList = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        eventList.add(event);
    }

    public Event getNextEvent() {
        return eventList.poll();
    }

    public boolean isEmpty() {
        return eventList.isEmpty();
    }

    public void printOrderedEvents() {
        PriorityQueue<Event> copy = new PriorityQueue<>(eventList);

        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }
    }
}