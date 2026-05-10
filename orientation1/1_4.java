import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_4 {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose action: 1 = queue, 2 = dequeue, 3 = exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                Customer customer = new Customer();
                customer.setStartTime(System.nanoTime());
                queue.addFirst(customer);
                System.out.println("Customer " + customer.getId() + " added to queue.");
            } else if (choice == 2) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    Customer customer = queue.removeLast();
                    customer.setEndTime(System.nanoTime());
                    System.out.println("Customer " + customer.getId()
                            + " spent " + customer.getTimeSpent() + " ns in queue.");
                }
            } else if (choice == 3) {
                break;
            }
        }

        scanner.close();
    }
}