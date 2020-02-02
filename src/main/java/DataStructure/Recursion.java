package DataStructure;

public class Recursion {
    static void triangle(int n){
        if (n==1){ printNStars(1);
        } else {
            triangle(n-1); printNStars(n);
        }
    }

    static  void printNStars(int n){
        for(int i =1;i<n;i++ ){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        triangle(3);
    }
}
