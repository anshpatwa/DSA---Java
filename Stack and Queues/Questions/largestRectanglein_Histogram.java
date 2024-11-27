//https://leetcode.com/problems/largest-rectangle-in-histogram/description/


import java.util.Stack;

public class largestRectanglein_Histogram {
    public static int largestRectangleArea(int[] height){
        Stack<Integer> stack = new Stack<>();
        int max =0;
        stack.push(0);

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] < height[stack.peek()]) {
                max = getmax(height, stack, max, i);

            }
            stack.push(i);
        }
        int i =height.length;
        while(!stack.isEmpty()){
            max =getmax(height,stack,max,i);
        }
        return max;
    }
    public static int getmax(int[] height, Stack<Integer> stack,int max,int index){
    int area;
    int popped = stack.pop();
    if (stack.isEmpty()){
        area= height[popped]*index;
    }else{
        area= height[popped]*(index-1-stack.peek());
    }
    return Math.max(max,area);
    }
    public static void main(String[] args) {
        int[] height ={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(height));
    }
}
