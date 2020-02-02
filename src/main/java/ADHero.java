import Inheritance.AP;
import Inheritance.Hero;
import Inheritance.Mortal;

public class ADHero extends Hero implements AP,Mortal {


    @Override
    public void magicAttack() {

        System.out.println("magicalAttack");
    }

    @Override
    public void die() {
        String name = null;
        System.out.println(name+ " 这个h2英雄挂了");
    }
}
