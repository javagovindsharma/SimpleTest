package codingchallenge.postpaidBillUsageProblem.serviceconstants;

/**
 * Created by Govind on 29/06/2018
 */
public enum ServiceType{
    LOCALCALL(0.50f),
    STDCALL(1.0f),
    ISDCALL(12.0f),
    LOCALSMS(0.25f),
    STDSMS(0.50f),
    ISDSMS(5.0f);

    private float rate;
    ServiceType(float rate){
        this.rate = rate;
    }
    public float getRate() {
        return rate;
    }

    public static ServiceType getServiceType(String serviceType, String type) {
        if("LOCAL".equalsIgnoreCase(serviceType) && "CALL".equalsIgnoreCase(type))
            return LOCALCALL;
        else if("LOCAL".equalsIgnoreCase(serviceType) && "SMS".equalsIgnoreCase(type))
            return LOCALSMS;
        else if("STD".equalsIgnoreCase(serviceType) && "CALL".equalsIgnoreCase(type))
            return STDCALL;
        else if("STD".equalsIgnoreCase(serviceType) && "SMS".equalsIgnoreCase(type))
            return STDSMS;
        else if("ISD".equalsIgnoreCase(serviceType) && "CALL".equalsIgnoreCase(type))
            return ISDCALL;
        else if("ISD".equalsIgnoreCase(serviceType) && "SMS".equalsIgnoreCase(type))
            return ISDSMS;
        return null;
    }
}
