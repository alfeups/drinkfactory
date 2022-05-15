package br.com.coffee.coffeefactory;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Wine implements Drink {

    @Override
    public void prepararDrink() {
        System.out.println("Servindo uma taça do Lala's!");
    }
}
