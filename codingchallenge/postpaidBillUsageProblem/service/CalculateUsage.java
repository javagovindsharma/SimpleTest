package codingchallenge.postpaidBillUsageProblem.service;

import codingchallenge.postpaidBillUsageProblem.inputParser.ParseInput;
import codingchallenge.postpaidBillUsageProblem.serviceconstants.ServiceConstants;
import codingchallenge.postpaidBillUsageProblem.serviceconstants.ServiceType;


/**
 * Created by Govind on 29/06/2018
 */
public class CalculateUsage {
    private static float totalCost = 0;
    private static int serviceUsage = 0;
    private ServiceType serviceType;

    public CalculateUsage(){
    }

    public float getCalculatedCost(){
        int usage = getServiceUsage();
        ServiceType serviceType = getServiceType();
        float cost = usage * serviceType.getRate();
        return cost;
    }

    public static StringBuilder outputFormat(float cost){
        StringBuilder stringBuilder = new StringBuilder();
        if(cost < ServiceConstants.MAX_PLAN_LIMIT){
            stringBuilder.append((int)cost + " ");
            stringBuilder.append(ServiceConstants.WITHIN_LIMIT_STRING);
        }
        else {
            stringBuilder.append((int)(cost)
                    + " " + ServiceConstants.EXCEEDED_LIMIT_BY_RS
                    + Math.abs((int)(ServiceConstants.MAX_PLAN_LIMIT - cost)));
        }
        return stringBuilder;
    }

    public void calculateUsage(String inputString){
        String[] serviceString = ParseInput.parseInput(inputString);
        setServiceUsage(Integer.parseInt(serviceString[0]));
        setServiceType(ServiceType.getServiceType(serviceString[1], serviceString[2]));
        setTotalCost(getCalculatedCost());
        String outputString = outputFormat(getTotalCost()).toString();
        printOutputString(outputString);
    }

    public static void printOutputString(String outputString) {
        System.out.print(outputString);
    }

    public static void setServiceUsage(int serviceUsage) {
        CalculateUsage.serviceUsage = serviceUsage;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public static int getServiceUsage() {
        return serviceUsage;
    }

    public static float getTotalCost() {
        return totalCost;
    }

    public static void setTotalCost(float totalCost) {
        CalculateUsage.totalCost = totalCost;
    }


}



