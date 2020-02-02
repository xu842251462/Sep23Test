package Inheritance;

import item.Item;

public class Hero extends Object{
    protected int moveSpeed = 500;
    public String name;
    public int hp;
    public int damage;
    public int id;


    //初始化name,hp,damage的构造方法
    public Hero(String name,int hp, int damage) {
        this.name =name;
        this.hp = hp;
        this.damage = damage;
    }

    public int compareTo(Hero anotherHero) {
        if(damage<anotherHero.damage)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hero(String name){
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }

    public Hero() {

    }

    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }

    public void kill(Mortal m){
        m.die();
    }

    public static void battleWin(){
        System.out.println("hero battle win");
    }

    public static void main(String[] args) {
        Hero h =new ADHero();
        h.name = "盖伦";
        System.out.println(h.toString());
        System.out.println(h);


    }
}
