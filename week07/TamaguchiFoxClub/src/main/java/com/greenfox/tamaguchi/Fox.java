package com.greenfox.tamaguchi;

import java.util.List;

public class Fox {

    String name;
   // List tricks;
    String food;
    String drink;

    public Fox(String name, String food, String drink) {
        this.name = name;
       // this.tricks = tricks;
        this.food = food;
        this.drink = drink;
    }

    public Fox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   // public List getTricks() {
      //  return tricks;
   // }

   // public void setTricks(List tricks) {
       // this.tricks = tricks;
   // }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
