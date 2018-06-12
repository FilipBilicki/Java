public abstract class Pizzeria extends Pizza {
	public Pizza zamowPizza(String type) {
		Pizza pizza;
		pizza = zrobPizza(type);
		
		pizza.przygotowanie();
		pizza.wypiek();
		pizza.krojenie();
		pizza.pakowanie();
		
		return pizza;
	}
	abstract Pizza zrobPizza(String type);
}

	
