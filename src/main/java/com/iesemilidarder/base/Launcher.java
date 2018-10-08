package com.iesemilidarder.base;

import com.iesemilidarder.base.data.Moto;

public class Launcher {
    public static void main(String... args) {
        System.out.println("Concesionario forest run app 7.0");
        Moto moto = new Moto();
        moto.start();
        System.out.println("let's go boizs");
        moto.brake();
    }

}
