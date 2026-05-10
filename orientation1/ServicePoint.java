import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();
    private long totalServiceTime = 0;
    private int servedCustomers = 0;

    public void addToQueueue(Customer customer) {
        customer.setStartTime(System.nanoTime());
        queue.addFirst(customer);
    }

    public Customer removeFromQueueue() {
        return queue.removeLast();
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueueue();

            long serviceStart = System.nanoTime();

            int sleepTime = 500 + (int)(Math.random() * 1000);

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long serviceEnd = System.nanoTime();

            customer.setEndTime(serviceEnd);

            long serviceTime = serviceEnd - serviceStart;
            long responseTime = customer.getTimeSpent();

            totalServiceTime += serviceTime;
            servedCustomers++;

            System.out.println("Customer " + customer.getId());
            System.out.println("Service time: " + serviceTime + " ns");
            System.out.println("Response time: " + responseTime + " ns");
            System.out.println();
        }
    }

    public double getAverageServiceTime() {
        if (servedCustomers == 0) {
            return 0;
        }
        return (double) totalServiceTime / servedCustomers;
    }
}