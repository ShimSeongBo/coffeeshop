package com.example.concurrency.coffeeshop;

public class Customer {

    private String nickname;
    private int money;

    public Customer(String nickname, int money) {
        this.nickname = nickname;
        this.money = money;
    }

    public int orderCoffee(int price) throws BeggerException {
        int updatedMoney = this.money - price;
        if (updatedMoney < 0) {
            System.out.println("어디 무전 취식을 하려고 해. 저리 나가.");
            throw new BeggerException("여기 거렁뱅이가 한 놈 있소.");
        }
        return updatedMoney;
    }

    public void borrowMoney(int price) {
        this.money += price;
    }

    public void landMoney(int price) throws BeggerException {
        int updatedMoney = this.money - price;
        if (updatedMoney < 0) {
            System.out.println("어디 무전 취식을 하려고 해. 저리 나가.");
            throw new BeggerException("여기 거렁뱅이가 한 놈 있소.");
        }
        System.out.println("여기 빌려줄게, " + price + "원이야...");
    }

    public String giveNickName() {
        return this.nickname;
    }

}
