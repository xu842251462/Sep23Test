package DataStructure;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221221));
    }

    private static boolean isPalindrome(int x) {


        if(x<0){
            return false;
        }else if(x>0&&x<10){
            return true;

        }else{
            StringBuilder s = new StringBuilder(String.valueOf(x));
            for(int i = 0; i<s.length()/2-1;i++){
                if(!(s.charAt(i)==s.charAt(s.length()-i-1))){
                    return  false;
                }
            }

        }


        return true;
    }
}
