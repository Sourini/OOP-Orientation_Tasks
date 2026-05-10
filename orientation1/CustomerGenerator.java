public class CustomerGenerator {
    public void generateCustomers(ServicePoint servicePoint, int amount) {
        for (int i = 0; i < amount; i++) {
            Customer customer = new Customer();
            servicePoint.addToQueueue(customer);
        }
    }
}