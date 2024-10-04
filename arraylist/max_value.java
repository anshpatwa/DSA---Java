public class max_value {
    static int max(int[] arr){
        int maxVal=arr[0];
        for(int i =1;i<arr.length;i++){
            if (arr[i]>maxVal) {
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    static int maxRange(int[] arr,int start,int end){
        int maxVal=arr[0];
        for(int i =start;i<end;i++){
            if (arr[i]>maxVal) {
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] arr={1,3,24,55,8,10,12};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 3));
    }
    
}
