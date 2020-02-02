public class Hero implements Comparable<Hero>{
    public String name;
    public float hp;
    public int damage;
    public int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
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

    public static String getCopyright() {
        return copyright;
    }

    public static void setCopyright(String copyright) {
        Hero.copyright = copyright;
    }

    static String copyright;
    static {
        System.out.println("初始化 copyright");
        copyright = "版权由Riot Games公司所有";
    }

    public Hero() {

    }

    // 增加一个初始化name的构造方法
    public Hero(String name) {

        this.name = name;
    }


    public void attackHero(Hero h2) {
        System.out.println(this.name+ " 正在攻击 " + h2.getName());
    }

    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    public Hero(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }


    @Override
    public int compareTo(Hero anotherHero) {
        if(damage<anotherHero.damage)
            return 1;
        else
            return -1;
    }
}