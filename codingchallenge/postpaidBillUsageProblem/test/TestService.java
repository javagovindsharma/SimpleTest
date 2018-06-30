package codingchallenge.postpaidBillUsageProblem.test;


import codingchallenge.postpaidBillUsageProblem.service.CalculateUsage;

import java.util.Scanner;

/**
 * Created by Govind on 29/06/2018
 */
/*
Input : 25 mins std call to abc
Output : 25 Within Limit
Input : 55 mins local call to abc
Output : 27 Within Limit
Input : 125 mins isd call to abc
Output : 1500 Exceeded Limit by Rs.1200
Input : 25 local sms to abc
Output : 6 Within Limit
Input : 50 std sms to abc
Output : 25 Within Limit

*/
public class TestService {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nInput : ");
            String input = s.nextLine();
//            "1000 mins isd call to abcd"
            System.out.print("\nOutput : ");
            new CalculateUsage().calculateUsage(input);
        }
    }
}
