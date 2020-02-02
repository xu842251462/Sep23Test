public class TestNumber {

  public static void main(String[] args) {
             try {
                        System.out.println(doStuff(args));
                }
               catch (Exception e) { System.out.println("exc"); }
                doStuff(args);
             }final
  static int doStuff(String[] args) {
                 return Integer.parseInt(args[0]);
              }

}
