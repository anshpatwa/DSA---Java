import java.sql.SQLOutput;

public class skip_a_string {
    static String skipword(String main , String target){
        if (main.isEmpty()){return "";}
        if (main.startsWith(target)){
            return skipword(main.substring(target.length()),target);
        }else {
            return main.charAt(0)+skipword(main.substring(1),target);
        }
    }
    // skip a string from a string in a specific condition
    // example - skip mob only when its not a mobile . which means word "mob" will get skip but not word "mobile"

    static String skipparticularly(String main, String target,String keeper){
        if (main.isEmpty()){return "";}
        if (main.startsWith(target) && !main.startsWith(keeper)) {
            return skipparticularly(main.substring(target.length()),target,keeper);
        }else {
            return main.charAt(0)+skipparticularly(main.substring(1),target,keeper);
        }
    }
    public static void main(String[] args) {
        String name = "aaaah laaaa laaa aaaah laaa la la la la ah ah ah aha la la";
        //System.out.println(skipword(name ,"ah"));
        String str = "mobile + mob == mobilemob";
        System.out.println(skipparticularly(str,"mob","mobile"));


    }
}
