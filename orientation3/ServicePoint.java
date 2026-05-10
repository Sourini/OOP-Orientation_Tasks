import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer customer) {
        queue.addFirst(customer);
    }

    public Customer removeFromQueue() {
        return queue.removeLast();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}