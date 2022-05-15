package br.com.coffee.coffeefactory;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Coffee implements Drink {

    @Override
    public void prepararDrink() {
        System.out.println("There you are! An americano grande.");
    }
}
