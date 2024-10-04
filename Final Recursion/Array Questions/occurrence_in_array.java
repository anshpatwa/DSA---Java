import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class occurrence_in_array {


    // linear search
    static int search(int[] arr, int target , int index){
        if (index==arr.length-1){return -1;}
        if (arr[index]==target){ return index;}
        return search(arr,target,index+1);
    }


    // Linear search from end
    static int search2(int[] arr, int target,int index){
        if (index==-1){return -1;}
        if (arr[index]==target){return index;}
        return search2(arr,target,index-1);
    }


    // finding all occurrence in array and returning in form of ArrayList
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findalloccurrence(int[] arr, int target , int index){
        if (arr[index]==target){list.add(index);}
        if (index==arr.length-1){return list;}
        return findalloccurrence(arr,target,index+1);
    }


    // returning ArrayList without initialising it outside(not creating static arraylist outside the function)
    // so passing it in the arguments
    static ArrayList<Integer> occurrences2(int[] arr, int target , int index, ArrayList<Integer> list ){
        if (arr[index]==target){list.add(index);}
        if (index == arr.length-1){return list;}
        return occurrences2(arr,target,index+1,list);
    }



    // if you don't want to pass ArrayList in argument
    static ArrayList<Integer> occurrence3(int[] arr, int target , int index ){
        ArrayList<Integer> newList = new ArrayList<>();
        if (arr[index]==target){newList.add(index);}
        if (index==arr.length-1){return newList;}

        ArrayList<Integer> ansfrombelowcalls = occurrence3(arr,target,index+1);
        newList.addAll(ansfrombelowcalls);
        return newList;
    }


    public static void main(String[] args) {
        int[] arr2 ={3,2,1,18,9};
        System.out.println(search(arr2,20,0));
        System.out.println(search2(arr2,2,arr2.length-1));
        int[] arr3 = {1,2,3,5,2,8,9,6,5,8,5};
        System.out.println(findalloccurrence(arr3, 5, 0));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(occurrences2(arr3,5,0,list));
        System.out.println("new-->"+occurrence3(arr3,5,0));
    }
}
