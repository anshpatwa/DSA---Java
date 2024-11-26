//https://www.hackerrank.com/challenges/game-of-two-stacks/problem


import java.util.Arrays;
import java.util.Scanner;

public class Game_of_Stacks {

    public static int two_Stacks(int max ,int[] a, int[] b){
        return Two_stacks(max,a,b,0,0)-1;
    }
    private static int Two_stacks(int max,int[] a, int[] b,int count,int sum){
        if (sum>max){
            return count;
        }
        if (a.length==0 || b.length==0){
            return count;
        }

        int ans1 = Two_stacks(max, Arrays.copyOfRange(a,1,a.length),b,count+1,sum+a[0]);
        int ans2 = Two_stacks(max, a,Arrays.copyOfRange(b,1,b.length),count+1,sum+a[0]);

        return Math.max(ans1,ans2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] =sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j]= sc.nextInt();
            }
            System.out.println(two_Stacks(x,a,b));
        }

    }
    
}

/*
COPY-PASTE THIS TO TERMINAL AFTER RUNNING THE PROGRAM
1
5 4 10
4 2 4 6 1
2 1 8 5
*/