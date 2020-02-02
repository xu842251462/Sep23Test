package Singleton;

public class GiantDragon {
    private GiantDragon(){

    };

    private static GiantDragon instance;

    public static  GiantDragon getDragon(){
        if(null == instance ){
            instance  = new GiantDragon();
        }
        return instance;
    }
}
