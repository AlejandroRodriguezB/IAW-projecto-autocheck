package com.iesemilidarder.base.data;

public abstract class Vehicle {
    public abstract void start();
    public void brake(){
        doLog("freno");
    }
    private String color;

    private Integer numberWheels;

    private Double price;

    public Integer getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(Integer numberWheels) {
        this.numberWheels = numberWheels;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void doLog(String message){
        System.out.println(message);
    }

    public String showLog(String message){
        doLog(message);
        return message;
    }

}

