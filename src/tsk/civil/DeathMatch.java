package tsk.civil;

public class DeathMatch {

    private int rounds;
    private ConstructedPerson winner;

    public void fight(ConstructedPerson warrior1, ConstructedPerson warrior2) {
        while (warrior1.isAlive() && warrior2.isAlive()) {
            warrior1.attack(warrior2);
            if (warrior2.isAlive()) warrior2.attack(warrior1);
            rounds++;
        }
        winner = warrior1.isAlive() ? warrior1 : warrior2;
        System.out.println("The fight is over after round: " + rounds);
        System.out.println("The winner is " + winner.getTheName() + ".");
    }

    public ConstructedPerson getWinner() {
        return winner;
    }

    public void setWinner(ConstructedPerson arg) {
        winner = arg;
    }
}
