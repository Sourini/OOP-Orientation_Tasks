public class OrientationTask1_5_6 {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator generator = new CustomerGenerator();

        generator.generateCustomers(servicePoint, 5);

        servicePoint.serve();

        System.out.println("Average service time: "
                + servicePoint.getAverageServiceTime() + " ns");
    }
}