public class Check_sortedarray {
    static boolean issorted(int[] arr, int index){
        if (index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && issorted(arr,index+1);
    }

    public static void main(String[] args) {
        int[] arr ={1,3,5,7,8,30,15,18,20};
        System.out.println(issorted(arr,0));

    }
}
