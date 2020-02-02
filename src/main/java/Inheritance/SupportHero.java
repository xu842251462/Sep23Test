package Inheritance;

public class SupportHero extends Hero implements Healer {

    public SupportHero(String name) {
        super(name);
    }

    @Override
    public void heal() {

    }
}
