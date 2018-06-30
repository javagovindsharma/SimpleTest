package arrays;

/**
 * Created by Govind on 29/06/2018
 */
/*
Given a set of non-negative integers, and a value sum,
determine if there is a subset of the given set with sum equal to given sum.
*/

public class SubsetSumProblem {
    public static boolean isSubsetSum(int[] set, int n ,int sum) {
        if(n==0 && sum !=0)
            return false;
        if(sum == 0)
            return true;
        if(set[n-1] > sum)
            isSubsetSum(set,n-1,sum);
        return isSubsetSum(set,n-1,sum) || isSubsetSum(set, n-1, sum-set[n-1]);

    }

    public static void main(String[] args){
        int set[] = {3, 34, 4, 12, 5, 2}, sum = 9;
        System.out.print(isSubsetSum(set,set.length,sum));
    }
}
