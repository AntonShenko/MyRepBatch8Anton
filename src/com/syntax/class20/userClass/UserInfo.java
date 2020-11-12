package com.syntax.class20.userClass;

public class UserInfo extends User{
    String userAddress;
    UserInfo(String name, String phoneNumber, String userAddress ){
        super(name, phoneNumber);
        this.userAddress = userAddress;
    }

    void userDetails(){
        System.out.println("User name is " + super.name + " has a phone number " + super.phoneNumber + " and lives in " + userAddress);
    }

    public static void main(String[] args) {
        UserInfo print = new UserInfo("Anton", "2018881560", "34 Berkley Pl");
        print.userDetails();
    }
}
