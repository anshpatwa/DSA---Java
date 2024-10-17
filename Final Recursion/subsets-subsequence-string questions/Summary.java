import java.util.ArrayList;
import java.util.List;

public class Summary {
    //  Subsets of a String
    static void subsets1(String main , String empty){
        if (main.isEmpty()){
            System.out.println(empty);
            return;
        }
        char ch = main.charAt(0);
        subsets1(main.substring(1),empty+ch);
        subsets1(main.substring(1),empty);
    }
    // PowerSet of a String
    static ArrayList<String> subsets2(String main,String empty){
        if (main.isEmpty()){
            ArrayList<String> answer = new ArrayList<>();
            answer.add(empty);
            return answer;
        }
        char ch = main.charAt(0);
        ArrayList<String> include = subsets2(main.substring(1),empty+ch);
        ArrayList<String> exclude = subsets2(main.substring(1),empty);
        include.addAll(exclude);
        return include;
    }

    //Power set of Array

    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> subsets = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        createsubset(nums,0,result,subsets);
            return result;

    }

    private static void createsubset(int[] nums, int index, List<List<Integer>> result, List<Integer> subsets) {
        if (index==nums.length){
            result.add(new ArrayList<>(subsets));
            return;
        }
        subsets.add(nums[index]);
        createsubset(nums,index+1,result,subsets);

        subsets.remove(subsets.size()-1);
        createsubset(nums,index+1,result,subsets);
    }

    public static void main(String[] args) {
        //subsets1("abc","");
       // System.out.println(subsets2("abc",""));
        int[] arr ={1,2,3};
        List<List<Integer>> answer = subsets(arr);
        for(List<Integer> list : answer){
            System.out.println(list);
        }
    }
}
