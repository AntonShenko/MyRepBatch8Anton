package com.syntax.class12;
    class BankUser {
        String name;
        String lastName;
        String login;
        String password;
        int userId;
        double amountOfMoney;
        Bank bank;

        public void transfer(int id,int money){
            bank.applyTransfer(userId, id, money);
        }
    }

    class Bank {
        String bankName;
        int rotingNum;
        BankUser[] users;

        BankUser findUser(int id){
            for(BankUser user:users){
                if (user.userId==id){
                    return user;
                }
            }
            return null;
        }

        public void applyTransfer(int from, int to, int money){
            BankUser userFrom = findUser(from);
            BankUser userTo = findUser(to);
            userFrom.amountOfMoney-=money;
            userTo.amountOfMoney+=money;
        }
    }

public class BankSystem {
    public static void main(String[] args) {
        BankUser user1 = new BankUser();
        user1.amountOfMoney = 100000;
        user1.userId = 12345;

        BankUser user2 = new BankUser();
        user2.amountOfMoney = 50000;
        user2.userId = 67890;


        Bank btb = new Bank();
        btb.users = new BankUser[2];
        btb.users[0] = user1;
        btb.users[1] = user2;
        user1.bank = btb;
        user2.bank = btb;

        user1.transfer(67890, 2000);
    }
}
