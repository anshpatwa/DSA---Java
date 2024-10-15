public class stream {
    // Approach 1
    static void skip_a_char(String str, char target , String output){
        if (str.isBlank()){
            System.out.println(output);
            return ;
        }
        char ch = str.charAt(0);
        if (ch==target){
            skip_a_char(str.substring(1),target,output);
        }else {
            skip_a_char(str.substring(1),target,output+ch);
        }
    }
    // Approach 2
    static String skip(String mainstring, char target){
        if (mainstring.isEmpty()){
            return "";
        }
        char ch = mainstring.charAt(0);
        if (ch == target){
            return skip(mainstring.substring(1),target);
        }else {
            return ch+ skip(mainstring.substring(1),target);
        }
    }
    public static void main(String[] args) {
    String str = "abbra_ka_dabra_";
    skip_a_char(str, 'a',"");
        System.out.println(skip(str,'a'));

    }
}
