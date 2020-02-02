package Singleton;

public class TestGiantDragon {
    //GiantDragon g = new GiantDragon();

    public static void main(String[] args) {
        GiantDragon g1 = GiantDragon.getDragon();
        GiantDragon g2 = GiantDragon.getDragon();
        GiantDragon g3 = GiantDragon.getDragon();

        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }

}
