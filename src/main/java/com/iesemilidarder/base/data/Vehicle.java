package com.iesemilidarder.base.data;

public abstract class Vehicle {
    public abstract void start();
    public void brake(){
        doLog("freno");
    }

    protected void doLog(String message){
        System.out.println(message);
    }

    public String showLog(String message){
        doLog(message);
        return message;
    }

}

