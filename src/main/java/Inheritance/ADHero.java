package Inheritance;

import item.Item;

public class ADHero extends Hero implements AD,Mortal  {

    int moveSpeed = 400;

    public ADHero() {

        super(" ");
    }

    @Override
    public void physicAttack() {

        System.out.println("physical attack");
    }


    public static void battleWin(){
        System.out.println("ad hero battle win");

    }


    @Override
    public void die() {
        System.out.println(name+ " 这个物理英雄挂了");

    }

    public ADHero(String name){
        super(name);
        System.out.println("AD Hero的构造方法");

    }

    public int getMoveSpeed(){
        return moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed ;
    }

    @Override
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }

    public static void main(String[] args) {
       ADHero h = new ADHero("德莱文");

       Item i = new Item();

        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());
        System.out.println();
        h.useItem(i);

    }
}