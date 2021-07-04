package com.ctsi.enums;

import java.util.Arrays;

public enum Degree {
    高中,
    大专,
    本科,
    硕士;

    public static Degree getDegreeByVal(byte val){
        return Arrays.stream(values()).filter(g->g.ordinal() == val).findAny().orElse(null);
    }

    public static String getDegreeStrByVal(byte val){
        Degree degree = getDegreeByVal(val);
        if(degree != null){
            return degree.name();
        }
        return "undefine";
    }

}
