public class stringpalindrome {
    public static boolean ispalindrome(String str) {
        if(str!=null){
            for(int i=0; i<str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-1-i)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main (String args []){
        String str = "madam";
        System.out.println(ispalindrome(str));
        System.out.println(str.length());
    }
}

