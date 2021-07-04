package com.ctsi.enums;

import java.util.Arrays;

public enum Sex {
    Male("男"),
    Female("女");

    private final String name;

    Sex(String name){
        this.name = name;
    }

    public static Sex getSexByVal(byte val){
        return Arrays.stream(values()).filter(g -> g.ordinal() == val).findAny().orElse(null);
    }
    public static String getSexStrByVal(byte val){
        Sex sex = getSexByVal(val);
        if(sex != null){
            return sex.getName();
        }
        return "undefine";
    }

    public String getName(){
        return name;
    }
}
