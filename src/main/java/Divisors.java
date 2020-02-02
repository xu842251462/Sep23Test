public class Divisors {
    public static void main(String[] args) {
        getDivisors(68834021);
    }
    private static void getDivisors(int input) {
        for(int i=1;i<=input;i++){
            if (input%i==0){
                System.out.println(i);
            }
        }
    }
}
