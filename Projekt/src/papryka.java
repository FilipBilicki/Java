
public class papryka extends pizzaDecorator{
Pizza pizza;

public papryka(Pizza pizza) {
	this.pizza=pizza;
}
public String pobierzOpis() {
	return pizza.pobierzOpis() + ", papryka";
}
public int pobierzSpicy() {
	return pizza.pobierzSpicy();
}
public String pobierzIngre() {
	return pizza.pobierzIngre();
}


public double koszt() {
	
	return pizza.koszt() + 4;
}
}