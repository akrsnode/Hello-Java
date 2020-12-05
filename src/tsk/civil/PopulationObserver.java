package tsk.civil;

public final class PopulationObserver {

    private static int population;
    private static int totalBorn;
    private static int totalDied;

    public static void increasePopulation() {
        totalBorn++;
        population++;
    }

    public static void decreasePopulation() {
        totalDied++;
        population--;
    }

    public static int getPopulation() {
        return population;
    }

    public static int getTotalBorn() {
        return totalBorn;
    }

    public static int getTotalDied() {
        return totalDied;
    }
}
