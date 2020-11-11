package com.syntax.class15.bank_check;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Bank {
    String name;
    Client[] listOfClients;

    public void initClients(){
        listOfClients = new Client[3];

        Client user1 = new Client();
        user1.name = "petya";
        user1.money = 10000;

        Client user2 = new Client();
        user2.name = "fedya";
        user2.money = 500;

        Client user3 = new Client();
        user3.name = "vasya";
        user3.money = 100000;

        listOfClients[0]= user1;
        listOfClients[1]= user2;
        listOfClients[2]= user3;
    }

    public String richClients(){
        String y ="";
        int count = 1;
        for (int i = 0; i < listOfClients.length; i++) {
            if (listOfClients[i].money > 1000) {
                y += count + ". " +listOfClients[i].name.toUpperCase() + ";\n";
                count++;
            }
        }
        return y;
    }

}

