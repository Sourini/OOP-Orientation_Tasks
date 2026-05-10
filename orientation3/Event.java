public class Event implements Comparable<Event> {
    private EventType type;
    private double eventTime;

    public Event(EventType type, double eventTime) {
        this.type = type;
        this.eventTime = eventTime;
    }

    public EventType getType() {
        return type;
    }

    public double getEventTime() {
        return eventTime;
    }

    @Override
    public int compareTo(Event other) {
        return Double.compare(this.eventTime, other.eventTime);
    }

    @Override
    public String toString() {
        return "Event type: " + type + ", time: " + eventTime;
    }
}