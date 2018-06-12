
public class srednia extends pizzaDecorator {
Pizza pizza;

public srednia(Pizza pizza) {
	this.pizza=pizza;
}
public String pobierzOpis() {
	return pizza.pobierzOpis() + ", srednia";
}
public int pobierzSpicy() {
	return pizza.pobierzSpicy();
}
public String pobierzIngre() {
	return pizza.pobierzIngre();
}


 public double koszt() {
	
	return pizza.koszt() + 8;
}
}