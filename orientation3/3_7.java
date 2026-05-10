public class OrientationTask3_7 {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        clock.setTime(0);

        EventList eventList = new EventList();
        ServicePoint servicePoint = new ServicePoint();

        ArrivalProcess arrivalProcess =
        new ArrivalProcess(EventType.ARRIVAL, 4);

        for (int i = 0; i < 10; i++) {
            arrivalProcess.generateNextEvent(eventList);
        }

        System.out.println("Clock time after last created event: " + clock.getTime());

        while (!eventList.isEmpty()) {
            Event event = eventList.removeNextEvent();

            Customer customer = new Customer(event.getEventTime());
            servicePoint.addToQueue(customer);
        }

        clock.setTime(clock.getTime() + 5);

        System.out.println();
        System.out.println("Clearing service point:");

        while (!servicePoint.isEmpty()) {
            Customer customer = servicePoint.removeFromQueue();

            customer.setDepartureTime(clock.getTime());

            System.out.println("Customer " + customer.getId()
                    + " spent " + customer.getTimeSpent()
                    + " time units in the system.");
        }
    }
}