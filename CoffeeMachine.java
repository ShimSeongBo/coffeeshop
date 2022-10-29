package com.example.concurrency.coffeeshop;

import java.util.List;

public class CoffeeMachine {

    private Button button;
    /**
     * waterLevel은 5 ~ 8 단계로 유지하길 바람
     */
    private int waterLevel;

    public CoffeeMachine() {
        this.button = Button.COLD;
        this.waterLevel = 10;
    }

    public void changeButton(Button button) {
        this.button = button;
    }

    public Coffee makeCoffeeFrom(List<Ingredient> ingredientList) {
        if (ingredientList.contains("커피 콩") && ingredientList.size() == 1) {
            return new Americano();
        } else if (ingredientList.contains("모히또")) {
            return new Americano();
        }
    }

    // 제조메서드
    // Input : List<재료>
    // Output : Coffee 종류

    public String cleanUp() {
        System.out.println("열심히 청소를 하자 먼지가 떨어집니다.");
        return "먼지";
    }

    // 청소메서드
    // Input : 없음
    // Output : 먼지


    public void addWaterLevel(int waterLevel) {
        this.waterLevel += waterLevel;
    }
    // 물 채우기
    // Input : 물
    // Output : 없음

}
