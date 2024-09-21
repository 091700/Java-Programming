public class zy11 {
    public static void main(String[] args) {
        int currentPopulation = 312032486;
        int secondsInAYear = 365 * 24 * 60 * 60;

        double birthsPerYear = secondsInAYear / 7.0;
        double deathsPerYear = secondsInAYear / 13.0;
        double immigrantsPerYear = secondsInAYear / 45.0;

        double populationChangePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;

        for (int year = 1; year <= 5; year++) {
            currentPopulation += populationChangePerYear;
            System.out.println("Year " + year + " population: " + (int)currentPopulation);
        }
    }
}
