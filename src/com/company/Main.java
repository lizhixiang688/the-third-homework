package com.company;

public class Main {

    public static void main(String[] args) {
    Person I=new Person();
    Jd jd=new Jd();
    I.shopping();       //我下单
    jd.setconsumer(I);  //得到我的联系方式
    jd.sellcomputer();  //得到电脑
    }
}
