public class OrientationTask1_3 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setStartTime(1000);
        customer.setEndTime(2500);

        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Time spent: " + customer.getTimeSpent());
    }
}