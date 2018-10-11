package com.iesemilidarder.base.data;

public class SistemUtilsHelper {

    private SistemUtilsHelper(){

    }
    public static void logError(Exception e){
        consolePrint("Error"+ e);
    }
    public static void consolePrint(String message){
        System.out.println(message);
    }
}
