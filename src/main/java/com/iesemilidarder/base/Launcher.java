package com.iesemilidarder.base;

import com.iesemilidarder.base.data.Moto;

public class Launcher {
    public static void main(String... args) {
        System.out.println("Concesionario forest run app 7.0");
        Moto moto = new Moto();
        moto.setNumberWheels(4);
        moto.setPrice(123.45);
        moto.setColor("blanco");
        System.out.println(moto.getColor());
        moto.setNumberWheels(4);
        moto.start();
        System.out.println("let's go boizs");
        moto.brake();
    }

}
