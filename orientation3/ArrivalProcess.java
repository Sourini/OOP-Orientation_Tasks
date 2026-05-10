import eduni.distributions.ChiSquare;

public class ArrivalProcess {
    private EventType eventType;
    private ChiSquare generator;

    public ArrivalProcess(EventType eventType, long degreesOfFreedom) {
        this.eventType = eventType;
        this.generator = new ChiSquare(degreesOfFreedom);
    }

    public void generateNextEvent(EventList eventList) {
        Clock clock = Clock.getInstance();

        double interval = generator.sample();

        double eventTime = clock.getTime() + interval;
        clock.setTime(eventTime);

        Event event = new Event(eventType, eventTime);
        eventList.addEvent(event);
    }
}