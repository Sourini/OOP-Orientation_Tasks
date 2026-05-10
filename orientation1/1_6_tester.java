public class 1_6_tester {
    public static void main(String[] args) {
        int numberOfRuns = 5;  
        int customersPerRun = 10;

        for (int i = 1; i <= numberOfRuns; i++) {
            System.out.println("Simulation #" + i);
            
            ServicePoint servicePoint = new ServicePoint();

            CustomerGenerator generator = new CustomerGenerator();
            generator.generateCustomers(servicePoint, customersPerRun);

            servicePoint.serve();

            System.out.println("Average service time for run " + i + ": "
                    + servicePoint.getAverageServiceTime() + " ns");
            System.out.println();
        }
    }
}