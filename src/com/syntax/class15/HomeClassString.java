package com.syntax.class15;

public class HomeClassString {
    public static boolean isContainEmail(String str) {
      if(str.contains("@") && str.contains(".com"))
          return true;
      else
          return false;
    }

public static int emailCountInString(String[] listOfClients) {
    int count = 0;
    for (int i = 0; i < listOfClients.length; i++) {
        if (isContainEmail(listOfClients[i])) {
            count++;
        }
    }
    return count;
}

    public static void main(String[] args) {
        String[] contactInfo = {"Hello my email is myemail@gmail.com and my name is Anton",
                "Hello my email is myemail@gmail.com and my name is Anton",
                "Hello my email is myemail@gmail.com and my name is Anton",
                "Hello my email is no and my name is Anton"};
            System.out.println(emailCountInString(contactInfo));


    }



    }

