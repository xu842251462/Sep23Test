package Inheritance;

public class ADAPHero extends Hero implements AD,AP,Mortal {

    public ADAPHero(String name) {
        super(name);
    }

    public ADAPHero() {

    }

    @Override
    public void physicAttack() {

        System.out.println("adAttack");
    }

    @Override
    public void attack() {
        System.out.println("这个ADAPHero自己的attack方法");
    }

    @Override
    public void magicAttack() {
        System.out.println("apAttack");

    }

    @Override
    public void die() {
        System.out.println(name+ " 这个h3挂了");

    }

    public static void main(String[] args) {

        ADAPHero mix = new ADAPHero();
        mix.attack();
    }
}
