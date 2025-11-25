package com.example.employeemanagment.utils;

import com.example.employeemanagment.Constraints.ApiConstants;

public class ApiUtils {

    public static String getMethodName(){
        try {
            return Thread.currentThread().getStackTrace()[1].getMethodName();
        }catch (Exception cg){
            return ApiConstants.UNDEFINED;
        }
    }
}
