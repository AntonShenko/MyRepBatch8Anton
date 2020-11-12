package com.syntax.class20.userProg;

class UserInfo extends User {

    String address;

    UserInfo(String address, String name, int number){
        super(name, number);//тут обратидлся к базовому констр родителя. и передал параметры.
        this.address = address;

    }

    public void print(){
        System.out.println(address+" " + name+" " + phoneNumber);
    }
}
