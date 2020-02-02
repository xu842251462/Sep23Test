package item;

public class Item {
    int price;
    String name;



    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果 ");
    }

    public static void main(String[] args) {

        Item i1 = new MagicPotion();
        Item i2 = new LifePortion();
        i1.effect();
        i2.effect();
        System.out.print("i1  是Item类型，执行effect打印:");
        System.out.print("i2也是Item类型，执行effect打印:");
    }
}
