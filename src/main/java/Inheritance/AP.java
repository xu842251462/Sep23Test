package Inheritance;

public interface AP {
    public void magicAttack();

    default public void attack(){
        System.out.println("magic attack");
    }
}
