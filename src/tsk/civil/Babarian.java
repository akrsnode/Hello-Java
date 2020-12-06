package tsk.civil;

public class Babarian extends Human implements ConstructedPerson {

    public Babarian(String name, int health) {
        super(name);
        this.health = health;
    }

    @Override
    public void attack(CanBeDamaged arg) {
        arg.acceptDamage(NumberGenerator.generateDamage());
    }

    @Override
    public void acceptDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String getTheName() {
        return getName();
    }
}
