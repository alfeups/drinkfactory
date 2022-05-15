package br.com.coffee.coffeefactory;

public class DrinkFactoryTest {

    public static void main(String[] args) {

        DrinkFactory drinkFactory = new DrinkFactory();

        Drink drink = drinkFactory.getDrink("Coffee");
        drink.prepararDrink();

        drink = drinkFactory.getDrink("Tea");
        drink.prepararDrink();

        drink = drinkFactory.getDrink("Beer");
        drink.prepararDrink();

        drink = drinkFactory.getDrink("Wine");
        drink.prepararDrink();

    }
}
