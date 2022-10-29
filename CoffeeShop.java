package com.example.concurrency.coffeeshop;

public class CoffeeShop {

    public static void main(String[] args) throws BeggerException {
        Customer customer1 = new Customer("Seong", 10000);
        int leftMoney = customer1.orderCoffee(5000);


        Customer customer2 = new Customer("Tony", 3000);

        try {
            customer1.landMoney(leftMoney + 200000);
            customer2.borrowMoney(leftMoney + 1000);
        } catch (BeggerException exception) {
            System.out.println("아 상웅 미안 ㅋ 나도 돈 부족함 ㅋ");
        }

        int tonyMoney = customer2.orderCoffee(4500);

    }
}
