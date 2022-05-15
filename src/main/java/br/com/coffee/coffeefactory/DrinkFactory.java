package br.com.coffee.coffeefactory;

public class DrinkFactory {

        Drink getDrink(String name) {
            switch (name) {
                case "Tea":
                    return new Tea();
                case "Coffee":
                    return new Coffee();
                case "Beer":
                    return new Beer();
                case "Wine":
                    return new Wine();
            }
            throw new RuntimeException("Infelizmente não temos esta bebida.");
        }
    }
