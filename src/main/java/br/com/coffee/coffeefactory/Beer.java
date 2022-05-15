package br.com.coffee.coffeefactory;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Beer implements Drink {

    @Override
    public void prepararDrink() {
        System.out.println("Brewing a Guinness!");
    }
}
