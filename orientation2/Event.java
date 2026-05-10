public class Event implements Comparable<Event> {
    private EventType type;
    private long eventTime;

    public Event(EventType type, long eventTime) {
        this.type = type;
        this.eventTime = eventTime;
    }

    public EventType getType() {
        return type;
    }

    public long getEventTime() {
        return eventTime;
    }

    @Override
    public int compareTo(Event other) {
        return Long.compare(this.eventTime, other.eventTime);
    }

    @Override
    public String toString() {
        return "Event type: " + type + ", time: " + eventTime;
    }
}