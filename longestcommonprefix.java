package vj;

public class longestcommonprefix {
    // Compute longest common prefix among three strings
    public static String longestCommonPrefix(String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null) {
            return "";
        }
 
       if(s1.length()>s2.length() && s1.length()>s3.length()){
            return longestCommonPrefix(s2,s3,s1);
        } else if(s2.length()>s1.length()&& s2.length()>s3.length()){
            return longestCommonPrefix(s1,s3,s2);
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == s2.charAt(i) && c == s3.charAt(i)) {
                sb.append(c);
            } else {
                break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "flowkjkhgkghk";
        String s2 = "flow";
        String s3 = "flight";

        System.out.println("Longest common prefix: " + longestCommonPrefix(s1, s2, s3));
    }
}