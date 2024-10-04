import java.util.ArrayList;

public class Linear_search {
    // single Occurance
    public static int findMe(int[] arr,int target,int index){
        if (arr[index]==target) {
            return index;
        }
        if (index==arr.length-1) {
            return -1;
        }
        return findMe(arr, target, index+1);
    }
    // Multiple Occurance
    static  ArrayList<Integer> occurances =new ArrayList<>();
    public static ArrayList<Integer> occurances(int[] arr,int target,int index){
       if (index==0) {
        occurances.clear();
       }
        if (index>=arr.length) {
            return occurances ;
        }
        if (arr[index]==target) {
            occurances.add(index);
        }
        return occurances(arr,target,index+1);
    }
    // Method 2
    public static ArrayList<Integer> occurances2(int[] arr,int target,int index,ArrayList<Integer> list){
         if (index>=arr.length) {
             return list ;
         }
         if (arr[index]==target) {
             list.add(index);
         }
         return occurances2(arr,target,index+1,list);
     }
     // Method 3
    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }



    public static void main(String[] args) {
        int[] arr ={3,2,1,18,9};
        System.out.println(findMe(arr, 18, 0));


        int[] arr2 = {1,2,3,4,1,5,6,1,7,1,1};
        System.out.println(occurances(arr2, 1, 0));

        int[] arr3={1,10,2,3,10,5,6,10,57,1,2,10};

        
        System.out.println(occurances(arr3, 10, 0));

        
        ArrayList<Integer> ans4=occurances2(arr3, 10, 0, new ArrayList<>());
        System.out.println(ans4);

        
       System.out.println(findAllIndex2(arr3, 10, 0));
    }
}
