package com.example.concurrency.coffeeshop;

public class Clerk {

    private String nickname;
    private WorkPosition workPosition;

    public Clerk(String nickname, WorkPosition workPosition) {
        this.nickname = nickname;
        this.workPosition = workPosition;
    }

    public void sellCoffee(int price) {
        Customer customer = new Customer("Rabbit", 1000000);
        String nickName = customer.giveNickName();
        System.out.println(nickName);
    }

}
