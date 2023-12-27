class Solution {
    public int climbStairs(int n) {
        //base case there is only 1 or 2 stair step
        if (n <= 2) return n;
        //else it's same as Fibonacci sequence
        int climbSecondLast = 1;
        int climbLast = 2;
        int climbCurrent = 0;
        for (int x = 2; x < n; x++){
            climbCurrent = climbSecondLast + climbLast;
            climbSecondLast = climbLast;
            climbLast = climbCurrent;
            
        }
        return climbCurrent;
    }
}
