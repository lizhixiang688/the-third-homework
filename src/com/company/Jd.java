package com.company;

public class Jd implements Sellcomputer{
    private Buycomputer consumer;
    public void setconsumer(Buycomputer a){
        this.consumer=a;
        System.out.println("...");
        try {                      //我只是代码的搬运工....
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("已收到您的订单");
    }
    public void sellcomputer(){
    Computer computer=new Computer("华硕");
        System.out.println("您的快递已发货");
    consumer.getcomputer(computer);
    }
}
