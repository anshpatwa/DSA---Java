public class Leetcode_Q2 {
    public static void main(String[] args) {
        int[][] customer1 = {{2,8,7}, {7,1,3},{1,9,5}};
        int maxWealth = 0;

        for (int[] customer : customer1) {
            int wealth = 0;
            for (int amount : customer) {
                wealth += amount;
            }
            System.out.println("Wealth of Customer is: " + wealth);
            maxWealth = Math.max(maxWealth, wealth);
        }

        System.out.println("Maximum wealth: " + maxWealth);
    }
}

// for(int j=0;j<customer1[i].length;j++){
//     sum += customer1[i][j];
// }