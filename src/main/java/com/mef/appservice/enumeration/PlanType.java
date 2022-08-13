package com.mef.appservice.enumeration;

public enum PlanType {
    BEGINNER(0),
    INTERMEDIATE(1),
    ADVANCED(2),
    NONE(3);


    private int val;

    PlanType(int i) {
        this.val = i;
    }

    public static PlanType  getEnum(int value){
        for (PlanType e:PlanType.values()) {
            if(e.val == value)
                return e;
        }
        return PlanType.NONE;//For values out of enum scope
    }
}
