public class Customer {
    private static int nextId = 1;

    private int id;
    private double arrivalTime;
    private double departureTime;

    public Customer(double arrivalTime) {
        this.id = nextId++;
        this.arrivalTime = arrivalTime;
    }

    public int getId() {
        return id;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public double getTimeSpent() {
        return departureTime - arrivalTime;
    }
}