package tsk.civil;

public final class NumberGenerator {

    public static int generateHealth() {
        return (int) (Math.random()*1000);
    }

    public static int generateDamage() {
        return (int) (Math.random()*100);
    }
}
