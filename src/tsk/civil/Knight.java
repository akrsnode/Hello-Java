package tsk.civil;

public class Knight extends Human implements ConstructedPerson {

    public Knight(String name, int health) {
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
