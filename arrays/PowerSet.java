package arrays;

import java.util.ArrayList;

/**
 * Created by Govind on 29/06/2018
 */
public class PowerSet {

    public static ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> list, int n){
        if(n == list.size())
            return new ArrayList<>();

        ArrayList<ArrayList<Integer>> subset = powerSet(list,n+1);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        Integer val = list.get(n);

        ArrayList<Integer> valArray = new ArrayList<>();
        valArray.add(val);

        result.add(valArray);
        result.addAll(subset);

        for(ArrayList<Integer> subsetValues : subset)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(val);
            for(Integer subsetValue : subsetValues) {
                temp.add(subsetValue);
            }
            result.add(temp);
        }
        return result;
    }

    public static void printPowerSet(ArrayList<Integer> list)
    {
        ArrayList<ArrayList<Integer>> allsubset = powerSet(list, 0);
        allsubset.add(new ArrayList<Integer>());
//        System.out.print(allsubset.size());
        for (int i = 0; i < allsubset.size(); i++)
            System.out.println(allsubset.get(i));
    }

    public static boolean isSubsetEqualSum(ArrayList<Integer> list, int sum){
        ArrayList<ArrayList<Integer>> powerSet = powerSet(list,0);
        for(ArrayList<Integer> subset : powerSet)
        {
            int sumTemp = 0;
            for(Integer subsetValue : subset)
            {
                sumTemp += subsetValue;
            }
            if(sum == sumTemp){
                return true;
            }
        }
        return false;
    }

    public static void printSubsetSumEqual(ArrayList<Integer> list, int sum){
        ArrayList<ArrayList<Integer>> powerSet = powerSet(list,0);
        ArrayList<ArrayList<Integer>> equalSubsetSum = new ArrayList<>();
        for(ArrayList<Integer> subset : powerSet)
        {
            int sumTemp = 0;
            for(Integer subsetValue : subset)
            {
                sumTemp += subsetValue;
            }
            if(sum == sumTemp){
                equalSubsetSum.add(subset);
            }
        }

        for (ArrayList<Integer> subset : equalSubsetSum)
            System.out.print(subset);
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(34);
        list.add(4);
        list.add(12);
        list.add(5);
        list.add(2);
//        printPowerSet(list);
        System.out.println("Subset exist : " +isSubsetEqualSum(list,7));
        printSubsetSumEqual(list,7);
    }

}
