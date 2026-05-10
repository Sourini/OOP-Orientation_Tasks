public class OrientationTask3_2 {
    public static void main(String[] args) {
        final int REITERATIONS = 1000;
        final int MAX_AGE = 30;

        int[][] ageDistribution = {
                {20, 23},
                {50, 24},
                {75, 25},
                {90, 26},
                {100, 27}
        };

        int[] generatedAges = new int[MAX_AGE + 1];

        for (int i = 0; i < REITERATIONS; i++) {
            int randomNumber = (int)(Math.random() * 100) + 1;

            int row = 0;
            while (randomNumber > ageDistribution[row][0]) {
                row++;
            }

            int age = ageDistribution[row][1];
            generatedAges[age]++;
        }

        System.out.println("Age  Count  Percentage");

        for (int age = 0; age <= MAX_AGE; age++) {
            if (generatedAges[age] > 0) {
                double percentage = (double) generatedAges[age] / REITERATIONS * 100;
                System.out.printf("%-4d %-6d %.2f %%\n", age, generatedAges[age], percentage);
            }
        }
    }
}