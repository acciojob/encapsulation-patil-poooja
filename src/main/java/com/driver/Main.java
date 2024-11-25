package com.driver;

public class Main {
        RWOnly ob = new RWOnly();
        //'name' has private access in 'com.driver.RWOnly'
        //ob.name="Pooja";
        //System.out.println(ob.name);
        ob.setName("Pooja");
        System.out.println(ob.getName());
}
