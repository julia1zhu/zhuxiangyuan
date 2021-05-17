package com.encapsulation;

public class AccountTest {
    public static void main(String[] args) {
        // 无参构造器的方法
        Account account = new Account();
        account.setName("朱香原");
        account.setBalance(10);
        account.setPassword("2137");
        System.out.println(account.getName() + " " + account.getBalance() + " " + account.getPassword());
    }
}
