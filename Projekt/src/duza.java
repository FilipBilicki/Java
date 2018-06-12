
public class duza extends pizzaDecorator {
Pizza pizza;

public duza(Pizza pizza) {
	this.pizza=pizza;
}
public String pobierzOpis() {
	return pizza.pobierzOpis() + ", duza";
}
public int pobierzSpicy() {
	return pizza.pobierzSpicy();
}
public String pobierzIngre() {
	return pizza.pobierzIngre();
}


 public double koszt() {
	
	return pizza.koszt() + 12;
}
}