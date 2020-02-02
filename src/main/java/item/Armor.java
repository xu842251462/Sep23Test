package item;

public class Armor  extends  Item{
    int ac;

    public static void main(String[] args) {
        Armor a = new Armor();
        a.ac = 15;
        a.name = "布甲";
        a.price= 300;

        Armor b = new Armor();
        b.ac = 40;
        b.name = "锁子甲";
        b.price= 500;




    }
}
