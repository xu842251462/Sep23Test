package Inheritance;

public class magicHero extends  Hero implements AP,Mortal {

    public magicHero(String name) {
        super(name);
    }

    public magicHero() {

    }

    @Override
    public void magicAttack() {

        System.out.println("magicalAttack");
    }

    @Override
    public void die() {
        System.out.println(name+ " 这个h2英雄挂了");
    }
}
