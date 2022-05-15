package br.com.coffee.coffeefactory;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tea implements Drink {

    @Override
    public void prepararDrink() {
        System.out.println("A black tea's on the way!");
    }
}
