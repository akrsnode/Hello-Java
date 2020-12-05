package tsk.civil;

public class Human {

    private String name;
    protected int health;

    public Human(String name) {
        this.name = name;
        PopulationObserver.increasePopulation();
        System.out.println("New human named "+name+". Population is: "+PopulationObserver.getPopulation()+".");
    }

    public String getName() {
        return name;
    }

}
