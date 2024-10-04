public class palindrome {
    public static boolean checkPalindrome(String s){
        if (s == null || s.length()==0) {
            return true;
        }
        int start=0;
        int end =s.length()-1;
        while (start<=end) {
            if (s.charAt(start)==s.charAt(end)) {
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s ="abcdcba";
        System.out.println(checkPalindrome(s));
    }
}
