package com.company;

public class Person implements Buycomputer{
    public void getcomputer(Computer computer){
        System.out.println("您的快递正在运输中...");
        try {                                        //希望不会挨打
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("您的快递已到货");
        System.out.println("我拿到了"+computer.name);
    }
    public void shopping(){
        System.out.println("您已下单");
    }
}
