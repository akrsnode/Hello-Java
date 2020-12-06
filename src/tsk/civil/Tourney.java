package tsk.civil;

import java.util.List;

public class Tourney {

    private List<ConstructedPerson> winners;

    public void runTourney(List<ConstructedPerson> list) {
        for (int i = 0; i < list.size(); i+=2) {
            DeathMatch match = new DeathMatch();

            try {
                match.fight(list.get(i), list.get(i+1));
            } catch (IndexOutOfBoundsException ex) {
                match.setWinner(list.get(i));
            }

            winners.add(match.getWinner());
        }
    }

    public void showWinners() {
        for (ConstructedPerson winner : winners) {
            System.out.println(winner);
        }
    }
}
