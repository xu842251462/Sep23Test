package Inheritance;

public interface AD {

    public void physicAttack();

    default public void attack(){
        System.out.println("phycial attack");
    }
}
