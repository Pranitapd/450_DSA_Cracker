package Algorithm.Dynamic_Programming;

public class Min_Cost_climbing_stairs {
    //https://leetcode.com/problems/min-cost-climbing-stairs/

    public int minCostClimbingStairs(int[] cost){
        int n =cost.length;
        for(int i=2;i<n;i++) {
            cost[i]+=Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[n-1], cost[n-2]);
    }
}
